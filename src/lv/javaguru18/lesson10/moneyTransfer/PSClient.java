package lv.javaguru18.lesson10.moneyTransfer;

import java.math.BigDecimal;
import java.util.List;

public class PSClient {
    public static void main(String[] args) {

        PaymentSystem paymentSystem = new PaymentSystemImpl();

        String bobsAccountNumber = paymentSystem.createAccount(new BigDecimal(100));
        String janesAccountNumber = paymentSystem.createAccount(new BigDecimal(30));

        paymentSystem.transact(bobsAccountNumber,janesAccountNumber,new BigDecimal(60));
        paymentSystem.transact(bobsAccountNumber,janesAccountNumber,new BigDecimal(-60));
        paymentSystem.transact(bobsAccountNumber,janesAccountNumber,new BigDecimal(600));

        List<Statement> statements = paymentSystem.findAllStatements(bobsAccountNumber);

        statements.stream()
                .forEach(System.out::println);

    }
}
