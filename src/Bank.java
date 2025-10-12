import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] holderName = new String[13];
        int[] accNo = new int[13];
        double[] amounts = new double[13];

        for (int i = 0; i < 13; i++) {
            System.out.print("Enter Account holder's name :");
            holderName[i] = scan.next();

            System.out.print("Account Number: ");
            accNo[i] = scan.nextInt();

            System.out.print("Amount: Rs ");
            amounts[i] = scan.nextDouble();
        }
        Boolean flow = true;
        while (flow) {
            System.out.print("1. Deposit");
            System.out.print("2. Withdraw");
            System.out.print("Choose an option: ");
            int choise = scan.nextInt();

            if (choise == 1) {
                System.out.println("Enter your Account number : ");
                int acc = scan.nextInt();

                System.out.println("Enter your current amount");
                double current = scan.nextInt();

                int num1 = -1;
                for (int i = 0; i < 13; i++) {
                    if (accNo[i] == acc && amounts[i] == current) {
                        num1 = i;
                        break;
                    }
                }

                if (num1 == -1) {
                    System.out.print("Account number is incorrect!");
                } else {
                    System.out.print("Enter your deposit amount : Rs ");
                    double depost = scan.nextDouble();
                    amounts[num1] += depost;
                    System.out.println("Transaction Sucessfull! Your new acc balance is Rs :" + amounts[num1]);
                }
            } else {
                System.out.println("Enter your Account number : ");
                int acc = scan.nextInt();

                System.out.println("Enter your current amount");
                double current = scan.nextInt();

                int num2 = -1;
                for (int i = 0; i < 13; i++) {
                    if (accNo[i] == acc && amounts[i] == current) {
                        num2 = i;
                        break;
                    }
                }

                if (num2 == -1) {
                    System.out.print("Account number or current amount is incorrect!");
                } else {
                    System.out.print("Enter your withdraw amount : Rs ");
                    double withdraw = scan.nextDouble();
                    amounts[num2] -= withdraw;
                    System.out.println("Transaction Sucessfull! Your new acc balance is Rs :" + amounts[num2]);
                }
            }
        }
    }
}

