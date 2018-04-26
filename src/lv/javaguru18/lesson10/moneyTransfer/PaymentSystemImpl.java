package lv.javaguru18.lesson10.moneyTransfer;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class PaymentSystemImpl implements PaymentSystem {

    private static final String SWIFT = "JGURU17LV";
    private long accountNumberSequence = 0;
    private accountRepo accRepo = new accountRepo();
    private TransactionRepo transactionRepo = new TransactionRepo();

    @Override
    public String createAccount(BigDecimal initialBalance) {
        if (BigDecimal.ZERO.compareTo(initialBalance) > 0) {
            throw new RuntimeException("FAILED To CREATE ACCOUNT!! Balance not positive amount!!");
        }
        Account newAccount = new Account(generateAccNum(), initialBalance, accountStatus.ACTIVE);
        accRepo.save(newAccount);
        return newAccount.getNumber();
    }

    @Override
    public List<Statement> findAllStatements(String accNumber) {
        return transactionRepo.findByAllAccountNumber(accNumber)
                .stream()
                .map(tr -> new Statement(tr, accNumber))
                .collect(Collectors.toList());

//        List<Statement> matchedTransactions = new  List<Statement>;
//        for (Transaction transaction : transactions) {
//            if (transaction.getCreditAcc().equals(accountNumber) ||
//                    transaction.getCreditAcc().equals(accountNumber)) {
//                matchedTransactions.add(new Statement(transaction, accountNumber));
//            }
//        }
//        if (matchedTransactions == null) {
//            throw new RuntimeException("Can't find such account number: " + accountNumber);
//        }
//        return matchedTransactions;


    }

    @Override
    public TransactionStatus transact(String fromAccNum, String toAccNum, BigDecimal amount) {
        Account fromAccount = accRepo.findByNumber(fromAccNum);
        Account toAccount = accRepo.findByNumber(toAccNum);

        Transaction transaction = toAccount.topUp(fromAccount, amount);
        transactionRepo.save(transaction);

        return transaction.getStatus();
    }

    private String generateAccNum() {
        return String.format("%s%012d", SWIFT, ++accountNumberSequence);
    }
}
