
package work;

public class Account extends Person {
    private String accountNumber;
    private double balance;

    public Account(int id, String name, String identity, String dob,
                   String accountNumber, double balance) {
        super(id, name, identity, dob);
        this.accountNumber = accountNumber;

        if (balance < 0) {
            throw new IllegalArgumentException(
                    "Initial balance cannot be negative."
            );
        }

        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    public void displayAccount() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Identity: " + getIdentity());
        System.out.println("Date of birth: " + getDob());
        System.out.println("Account number: " + accountNumber);
        System.out.printf("Balance: %.2f RWF%n", balance);
    }
}
