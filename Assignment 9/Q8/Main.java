import banking.SavingsAccount;
import banking.CheckingAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000);
        CheckingAccount checking = new CheckingAccount(500);

        savings.deposit(200);
        checking.withdraw(100);

        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Checking Account Balance: " + checking.getBalance());
    }
}
