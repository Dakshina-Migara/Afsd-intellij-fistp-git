import java.util.Scanner;

public class Details2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Employee[] employee = new Employee[3];

        int managerCount = 1;
        int engineerCount = 1;
        int serventCount = 1;


        for (int i = 0; i < employee.length; i++) {

            System.out.print("Enter the who are you(1.manager/2.engineer/3.servent): ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the Manager Name: ");
                    String employeeName = scan.next();

                    System.out.print("Enter the Manager Age: ");
                    int managerAge = scan.nextInt();

                    System.out.print("Enter the Manager Education Qualification: ");
                    String managerQualification = scan.next();

                    Manager details = new Manager(managerCount++);

                    details.setEmployeeName(employeeName);
                    details.setManagerAge(managerAge);
                    details.setManagerQualification(managerQualification);

                    employee[i] = details;
                    break;

                case 2:
                    System.out.print("Enter the Engineer Name: ");
                    String employeeName1 = scan.next();

                    System.out.print("Enter the Engineer Salary: ");
                    double engineerSalary = scan.nextDouble();

                    System.out.print("Enter the Engineer University: ");
                    String engineerUniversity = scan.next();

                    Engineer details1 = new Engineer(engineerCount++);

                    details1.setEmployeeName(employeeName1);
                    details1.setEngineerSalary(engineerSalary);
                    details1.setEngineerUniversity(engineerUniversity);

                    employee[i] = details1;
                    break;

                case 3:
                    System.out.print("Enter the Servent Name: ");
                    String employeeName2 = scan.next();

                    System.out.print("Enter the Servent Department: ");
                    String serventDepartment = scan.next();

                    System.out.print("Enter the Servent Address: ");
                    String serventAddress = scan.next();

                    Servent details2 = new Servent(serventCount++);

                    details2.setEmployeeName(employeeName2);
                    details2.setServentAddress(serventAddress);
                    details2.setServentDepartment(serventDepartment);

                    employee[i] = details2;
                    break;

                default:
                    System.out.println("invalid choice");
                    break;
            }
        }
        for (Employee emp : employee) {
            emp.duty();
        }
    }
}