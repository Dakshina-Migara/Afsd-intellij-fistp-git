import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //for loop

        double totalSalary = 0.0;

        for (int i = 0; i < 5; i++) {
            System.out.println("enter the employee salary");
            totalSalary += scan.nextDouble();
            System.out.println("Average salary is: " + (totalSalary / 5));

            if (totalSalary >= 100000) { //100000 wada salary apu gaman break eken loop eka code block wenawa forcefuly
                break; //break ekak demmama mulu loop ekatama add wenawa
            }
        }
    }
}

