package lv.javaguru18.lesson10.moneyTransfer;

import java.math.BigDecimal;

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

    public BigDecimal getBalance() {
        return balance;
    }

    public accountStatus getStatus() {
        return status;
    }
}
