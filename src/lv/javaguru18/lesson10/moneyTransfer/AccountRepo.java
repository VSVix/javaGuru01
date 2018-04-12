package lv.javaguru18.lesson10.moneyTransfer;

import java.util.HashMap;
import java.util.Map;

public class AccountRepo {

    private Map<String, Account> accounts = new HashMap();

    public void save(Account account) {
        accounts.put(account.getNumber(), account);
    }


}
