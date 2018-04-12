package lv.javaguru18.lesson10.moneyTransfer;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class transaction {
    private  String creditAcc;
    private  String debitAcc;
    private  BigDecimal ammount;
    private TransactionStatus status;
    private final LocalDateTime createdAt;
    private  String failReason;


    public transaction(String creditAcc, String debitAcc, BigDecimal ammount, TransactionStatus status, String datefailReason) {
        this.creditAcc = creditAcc;
        this.debitAcc = debitAcc;
        this.ammount = ammount;
        this.status = status;
        this.createdAt = LocalDateTime.now();
        this.failReason = datefailReason;
    }

    public String getCreditAcc() {
        return creditAcc;
    }

    public void setCreditAcc(String creditAcc) {
        this.creditAcc = creditAcc;
    }

    public String getDebitAcc() {
        return debitAcc;
    }

    public void setDebitAcc(String debitAcc) {
        this.debitAcc = debitAcc;
    }

    public BigDecimal getAmmount() {
        return ammount;
    }

    public void setAmmount(BigDecimal ammount) {
        this.ammount = ammount;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public LocalDateTime getDate() {
        return createdAt;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }
}
