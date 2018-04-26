package lv.javaguru18.lesson10.moneyTransfer;

import java.math.BigDecimal;
import java.util.List;

public interface PaymentSystem {

    TransactionStatus transact(String fromAccNum, String toAccNum, BigDecimal ammount);

    String createAccount(BigDecimal initialBalance);

    List<Statement> findAllStatements(String accNumber);

}
