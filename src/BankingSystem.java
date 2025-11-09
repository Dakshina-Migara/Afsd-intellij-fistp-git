import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] holderName = new String[3];
        int[] accountNumber = new int[3];
        double[] accountbalance = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("enter the " + i + " account holder name: ");
            holderName[i] = scan.next();

            System.out.print("enter the " + i + " account number: ");
            accountNumber[i] = scan.nextInt();

            System.out.print("enter the " + i + " account balance: ");
            accountbalance[i] = scan.nextDouble();
        }

        boolean isLoginSuccess = true;
        while (isLoginSuccess) {
            System.out.print("Enter account number : ");
            int accountNumber1 = scan.nextInt();

            System.out.print(" deposit or withdraw: ");
            String choose = scan.next();

            String nameDeposit = "deposit";
            String nameWithdraw = "withdraw";


            if (choose.equals(nameDeposit)) {
                System.out.print("enter the amount you deposit : ");
                double deposit = scan.nextDouble();
                for (int p = 0; p < 3; p++) {
                    if (accountNumber[p] == accountNumber1) {
                        accountbalance[p] += deposit;
                        System.out.println("amount of deposit " + accountbalance[p]);
                    }

                }
            }
            if (choose.equals(nameWithdraw)) {
                System.out.print("enter the amount you withdraw : ");
                double withdraw = scan.nextDouble();
                for (int h = 0; h < 3; h++) {
                    if (accountNumber[h] == accountNumber1) {
                        accountbalance[h] -= withdraw;
                        System.out.println("amount of deposit " + accountbalance[h]);
                    }
                }
            }
        }
    }
}
