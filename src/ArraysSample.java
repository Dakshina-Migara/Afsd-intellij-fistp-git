import java.util.Scanner;

public class ArraysSample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] subjects = new String[9];
        int[] marks = new int[9];

        for (int i = 0; i < 9; i++) {
            System.out.print("enter the " + i + " subject name: ");
            subjects[i] = scan.next();

            System.out.print("enter the " + i + "  mark: ");
            marks[i] = scan.nextInt();
        }

        int maxMarked = marks[0];
        int maxMarkedIndex= 0;
        for (int p = 0; p < 9; p++) {
            if (marks[p] > maxMarked) {
                maxMarked = marks[p];
                maxMarkedIndex = p;
            }
        }
        System.out.println("Max marked subject name is " + subjects[maxMarked]);


        double totalMark = 0;
        for (int h = 0; h < 9; h++) {
            totalMark += marks[h];
        }
        System.out.println("Average mark of the student is : " + (totalMark / 9));

    }
}
