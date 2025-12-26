package task6;

import java.math.BigDecimal;
import java.util.UUID;

public class ConcurrentBankExample {
    public static void main(String[] args) {
        ConcurrentBank bank = new ConcurrentBank();

        BankAccount account1 = bank.createAccount(UUID.randomUUID(),BigDecimal.valueOf(1000));
        BankAccount account2 = bank.createAccount(UUID.randomUUID(),BigDecimal.valueOf(1000));

        Thread transferThread1 = new Thread(() -> bank.transfer(account1, account2, BigDecimal.valueOf(200)));
        Thread transferThread2 = new Thread(() -> bank.transfer(account2, account1, BigDecimal.valueOf(100)));

        transferThread1.start();
        transferThread2.start();

        try {
            transferThread1.join();
            transferThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Total balance: " + bank.getTotalBalance());
        System.out.println("Account with UUID " + account1.getIdWallet() + ": " + account1.getBalance());
        System.out.println("Account with UUID " + account2.getIdWallet() + ": " + account2.getBalance());
    }
}

