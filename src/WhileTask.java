import java.util.Scanner;

public class WhileTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the value");
        int val = scan.nextInt();

        while (val > 0) {
            System.out.println(val % 10);
            val = val / 10;
        }
    }
}




