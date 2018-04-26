package lv.javaguru18.lesson10.moneyTransfer;

import java.util.*;
import java.util.stream.Collectors;

public class TransactionRepo {

    private List<Transaction> transactions = new ArrayList<>();

    public void save(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> findByAllAccountNumber(String accountNumber) {
//        List<Statement> matchedTransactions = new ArrayList<>();
//        for(Transaction transaction : transactions){
//            if (transaction.getCreditAcc().equals(accountNumber)||
//                    transaction.getCreditAcc().equals(accountNumber)) {
//                matchedTransactions.add(new Statement(transaction, accountNumber));
//            }
//        }
//        if (matchedTransactions == null){
//            throw new RuntimeException("Can't find such account number: "+accountNumber);
//        }
//        return matchedTransactions;

        return transactions.stream()
                .filter(tr -> isCorrectAccountNumber(accountNumber, tr))
                .collect(Collectors.toList());
    }

    private boolean isCorrectAccountNumber(String accountNumber, Transaction transaction) {
        return transaction.getCreditAcc().equals(accountNumber)||
                transaction.getCreditAcc().equals(accountNumber);
    }

    public Collection<Transaction> getAll() {
        return transactions;
    }
}
