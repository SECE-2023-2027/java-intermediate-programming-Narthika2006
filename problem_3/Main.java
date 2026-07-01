package problem_3;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter account number:");
        String accountNumber = sc.nextLine();

        System.out.println("Enter account holder name:");
        String accountHolderName = sc.nextLine();

        System.out.println("Enter initial balance:");
        double balance = sc.nextDouble();

        BankAccount account =
                new BankAccount(accountNumber, accountHolderName, balance);

        System.out.println("Enter deposit amount:");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Enter withdrawal amount:");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("Current Balance: " + account.getBalance());
    }
    
    
}
