package task6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class ConcurrentBank {

    private final List<BankAccount> accounts = new ArrayList<>();

    public BankAccount createAccount(UUID uuid) {
        BankAccount bankAccount = new BankAccount(uuid);
        accounts.add(bankAccount);
        return bankAccount;
    }

    public BankAccount createAccount(UUID uuid, BigDecimal amount) {
        BankAccount bankAccount = new BankAccount(uuid,amount);
        accounts.add(bankAccount);
        return bankAccount;
    }

    public BankAccount createAccount() {
        BankAccount bankAccount = new BankAccount();
        accounts.add(bankAccount);
        return bankAccount;
    }

    public void transfer(BankAccount account1, BankAccount account2, BigDecimal value) {
        if (value.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Transfer amount must be positive");
        }
        synchronized (account1) {
            synchronized (account2) {
                if (account1.getBalance().compareTo(value) < 0) {
                    throw new IllegalArgumentException("Insufficient funds in account1");
                }
                account2.deposit(value);
                account1.withdraw(value);
            }
        }
    }

    public BigDecimal getTotalBalance() {
        BigDecimal res = BigDecimal.ZERO;
        for (BankAccount a : accounts){
            res = res.add(a.getBalance());
        }
        return res;
    }
}
