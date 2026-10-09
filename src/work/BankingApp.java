
package work;

public class BankingApp {
    public static void main(String[] args) {
        Account account = new Account(
                1,
                "Dan",
                "1199080012345678",
                "2009-08-19",
                "ACC001",
                50000
        );

        System.out.println("INITIAL ACCOUNT DETAILS");
        account.displayAccount();

        System.out.println("\n--- Depositing 20000 RWF ---");
        account.deposit(20000);
        System.out.printf("Balance: %.2f RWF%n", account.getBalance());

        System.out.println("\n--- Withdrawing 10000 RWF ---");
        account.withdraw(10000);
        System.out.printf("Balance: %.2f RWF%n", account.getBalance());

        System.out.println("\n--- Trying to withdraw 100000 RWF ---");
        account.withdraw(100000);
        System.out.printf("Balance: %.2f RWF%n", account.getBalance());

        System.out.println("\n--- Trying to deposit -500 RWF ---");
        account.deposit(-500);
        System.out.printf("Balance: %.2f RWF%n", account.getBalance());
    }
}
