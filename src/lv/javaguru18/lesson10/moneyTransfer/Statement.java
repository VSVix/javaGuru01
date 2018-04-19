package lv.javaguru18.lesson10.moneyTransfer;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Statement {

    private final String firstAccountNumber;
    private final String seciondAccountNumber;
    private final BigDecimal amount;
    private final LocalDateTime transactionTime;
    private final TransactionStatus transactionStatus;
    private final String failReason;


    public Statement(Transaction transaction, String accountNumber) {
        this.transactionTime = transaction.getCreatedAt();
        this.transactionStatus = transaction.getStatus();
        this.failReason = transaction.getFailReason();

        if (accountNumber.equals(transaction.getCreditAcc())){
            this.firstAccountNumber = transaction.getCreditAcc();
            this.seciondAccountNumber = transaction.getDebitAcc();
            this.amount = transaction.getAmmount().negate();

        } else {
            this.seciondAccountNumber = transaction.getCreditAcc();
            this.firstAccountNumber  = transaction.getDebitAcc();
            this.amount = transaction.getAmmount();

        }
    }
}
