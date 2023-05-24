import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

class BankingSystem {
    private List<Account> accounts;

    public BankingSystem() {
        accounts = new ArrayList<>();
    }

    public void createAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(Account account) {
        accounts.remove(account);
    }

    public void displayAllAccounts() {
        System.out.println("All Accounts:");
        for (Account account : accounts) {
            account.displayAccountDetails();
        }
    }
}

public class BankingSystemDemo {
    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();

        Account account1 = new Account("123456789", "John Doe", 1000.0);
        bankingSystem.createAccount(account1);

        Account account2 = new Account("987654321", "Jane Smith", 2000.0);
        bankingSystem.createAccount(account2);

        Account account3 = new Account("456789123", "Mike Johnson", 
