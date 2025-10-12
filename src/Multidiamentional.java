import java.util.Scanner;

public class Multidiamentional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        int[][][] age = new int[3][4][5];
//        age[2][2][3] = 10;

//        for (int i = 0; i < 17; i++) { //employeesla 17
//            for (int j = 0; j < 7; j++) { // eka employee kenekta wahana 7
//                for (int k = 0; k < 4; k++) { //eka wahanekata tyre 4
//                    age[0][0][3] = 60; //4 weni tyre eka tyre pessure eka
//                }
//            }
//        }

        String[] department = new String[5];
        double[][] salary = new double[5][13];

        for (int i = 0; i < 5; i++) {
            System.out.print("enter the name of the " + i + " department: ");
            department[i] = scan.next();

            for (int j = 0; j < 13; j++) {
                System.out.print("enter the " + j + " employee of the salary: ");
                salary[i][j] = scan.nextDouble();
            }
        }
        for (int h = 0; h < 5; h++) {
            double total = 0;
            for (int k = 0; k < 13; k++) {
                total += salary[h][k];
            }
            System.out.println(department[h] + " department average is " + (total / 13));
        }

        double maxSalary = 0.0;
        int maxSalaryIndex = 0;
        for (int i = 0; i < 5; i++) {
            double total = 0.0;

            for (int p = 0; p < 13; p++) {
                total += salary[i][p];

                if (total > maxSalary) {
                    maxSalary = salary[i][p];
                    maxSalaryIndex = i;
                }
            }
        }
        System.out.println("Max Salary department is " + department[maxSalaryIndex]);

    }
}
