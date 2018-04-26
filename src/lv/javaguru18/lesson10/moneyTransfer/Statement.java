package lv.javaguru18.lesson10.moneyTransfer;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class Statement {

    private static final DateTimeFormatter CREATED_DATE_FORMATER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private final String firstAccountNumber;
    private final String secondAccountNumber;
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
            this.secondAccountNumber = transaction.getDebitAcc();
            this.amount = transaction.getAmmount().negate();

        } else {
            this.secondAccountNumber = transaction.getCreditAcc();
            this.firstAccountNumber  = transaction.getDebitAcc();
            this.amount = transaction.getAmmount();

        }
    }

    @Override
    public String toString() {
//        return "Acc1: " + firstAccountNumber
//                + ", Acc2: " + secondAccountNumber
//                +", Amount: " + amount
//                +", Date: " + transactionTime
//                +", Status: " + transactionStatus
//                ;
        return String.format("%s%26s%8s%25s%15s%35s",
                firstAccountNumber,
                secondAccountNumber,
                amount.toPlainString(),
                CREATED_DATE_FORMATER.format(transactionTime),
                transactionStatus.name(),
                Optional.ofNullable(failReason).orElse(" ")
                );
    }
}
