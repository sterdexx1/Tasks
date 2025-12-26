package task6;

import java.math.BigDecimal;
import java.util.UUID;

public class BankAccount {

    private BigDecimal amount;
    private final UUID idWallet;

    public BankAccount() {
        this.idWallet = UUID.randomUUID();
    }

    public BankAccount(UUID idWallet) {
        this.idWallet = idWallet;
    }

    public BankAccount(UUID idWallet, BigDecimal amount) {
        this.idWallet = idWallet;
        this.amount = amount;
    }

    public BankAccount(BigDecimal amount) {
        this.amount = amount;
        this.idWallet = UUID.randomUUID();
    }

    public UUID getIdWallet() {
        return idWallet;
    }

    public synchronized void deposit(BigDecimal value) {
        if (value.compareTo(BigDecimal.ZERO) >= 0) {
            amount = amount.add(value);
        }
    }

    public synchronized void withdraw(BigDecimal value) {
        if ((value.compareTo(BigDecimal.ZERO) >= 0) && value.compareTo(amount) <= 0) {
            amount = amount.subtract(value);
        }
    }

    public synchronized BigDecimal getBalance() {
        return amount;
    }

}
