package lv.javaguru18.lesson10.moneyTransfer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Account {
    //    private static final String SWIFT = "JGURU17LV";
    private final String number;
    private BigDecimal balance;
    private accountStatus status;

    public Account(String number, BigDecimal balance, accountStatus status) {
        this.number = number;
        this.balance = balance;
        this.status = status;
    }

    public String getNumber() {
        return number;
    }

    public Transaction topUp(Account fromAccount, BigDecimal amount) {

        Transaction transaction = new Transaction(fromAccount.number, this.number, amount);

        try {

            fromAccount.validateStatus();
            if (BigDecimal.ZERO.compareTo(amount) > 0) {
                throw new IllegalArgumentException("Amount must be greater than 0!");
            }
            fromAccount.decreaseBalance(amount);
            balance.add(amount);
            transaction.setStatus(TransactionStatus.SUCCECFULL);

        } catch (IllegalStateException | IllegalArgumentException e) {
            transaction.setStatus(TransactionStatus.FAILED);
            transaction.setFailReason(e.getMessage());
        }
        return transaction;
    }

    private void decreaseBalance(BigDecimal amount) {
        validateStatus();
        BigDecimal decreasedBalance = balance.subtract(amount);
        if (BigDecimal.ZERO.compareTo(decreasedBalance) > 0) {
            throw new IllegalStateException("Insufficient funds!");
        }
        balance = decreasedBalance;
    }

    private void validateStatus() {
        if (accountStatus.BLOCKED == status) {
            throw new IllegalArgumentException("Account blocked:" + number);
        }
    }
}
