package thirteenth.firstTask.com.megabankcorp.records;

import java.math.BigDecimal;

public class Account {
    private BigDecimal currentBalance;
    private long accountNumber;
    private long clientNumber;

    public Account(BigDecimal currentBalance, long accountNumber, long clientNumber){
        this.currentBalance = currentBalance;
        this.accountNumber = accountNumber;
        this.clientNumber = clientNumber;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(long clientNumber) {
        this.clientNumber = clientNumber;
    }
}
