package thirteenth.firstTask.com.megabankcorp.system;

import thirteenth.firstTask.com.megabankcorp.records.Account;

import java.math.BigDecimal;

public abstract class Database {
    public abstract void deposit(BigDecimal balance, Account account);

    public abstract void withdraw(BigDecimal balance, Account account);

    protected abstract BigDecimal getAmount(Account account);

    void transfer(BigDecimal balance, Account accountFrom, Account accountTo){
        deposit(balance, accountTo);
        withdraw(balance, accountFrom);
    }
}
