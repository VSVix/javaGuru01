package lv.javaguru18.lesson10.moneyTransfer;

import java.math.BigDecimal;
import java.util.List;

public class PaymentSystemImpl implements PaymentSystem {

    private static final String SWIFT = "JGURU17LV";
    private long accountNumberSequence = 0;
    private AccountRepo accRepo = new AccountRepo();

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
    public List<Statement> findAllStatemens(String accNumber) {
        return null;
    }

    @Override
    public TransactionStatus transact(String fromAccNum, String toAccNum, BigDecimal amount) {


        return null;
    }

    private String generateAccNum() {
        return String.format("%s%012d", SWIFT, ++accountNumberSequence);
    }
}
