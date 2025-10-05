import java.util.Scanner;

public class Abcpvt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

           // store the salary
        double[] salary = new double[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("enter the " + i + " employee salary Rs: ");
            salary[i] = scan.nextDouble();
        }
            // find salary is grater than 130000 and store the new salaries
        double[] newSalary = new double[8];
        for (int h = 0; h < 8; h++) {
            if (salary[h] >= 130000) {
                newSalary[h] = salary[h] + (salary[h] * 12 / 100);
            } else {
                newSalary[h] = salary[h];
            }
        }
             // how much overcost for the increments
        double overcostSalary = 0;
        for (int p = 0; p < 8; p++) {
            if (salary[p] >= 130000) {
                overcostSalary += newSalary[p] - salary[p];
            }
        }
        System.out.println("salary overcost total is Rs: " + overcostSalary);
    }
}
