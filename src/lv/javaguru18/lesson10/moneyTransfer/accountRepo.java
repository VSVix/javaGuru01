package lv.javaguru18.lesson10.moneyTransfer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class accountRepo {

    private Map<String, Account> accounts = new HashMap();

    public void save(Account account) {
        accounts.put(account.getNumber(), account);
    }

    public Account findByNumber(String number) {
        Account account = accounts.get(number);
        if (account == null){
            throw new RuntimeException("Can't find such account number: "+number);
        }
        return accounts.get(number);
    }

    public Collection<Account> findAll() {
        return accounts.values();
    }

}
