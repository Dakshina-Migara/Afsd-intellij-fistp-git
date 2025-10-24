import java.util.Scanner;

public class Abcpvtltd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        EmplyeeData[] employee = new EmplyeeData[5];
        int moreSalaryCount = 0;

        for (int i = 0; i < employee.length; i++) {

            System.out.print("Enter name for employee : ");
            String employeeName = scan.next();

            System.out.print("Enter age for employee: ");
            int employeeAge = scan.nextInt();

            System.out.print("Enter nic number for employee: ");
            int nicNumber = scan.nextInt();

            System.out.print("Enter address for employee: ");
            String address = scan.next();

            System.out.print("Enter salary for employee: ");
            double employeeSalary = scan.nextDouble();

            EmplyeeData employer = new EmplyeeData();
            employer.employeeName = employeeName;
            employer.employeeAge = employeeAge;
            employer.address = address;
            employer.employeeSalary = employeeSalary;
            employer.nicNumber = nicNumber;

            employee[i] = employer;

        }
        int count = salaryCount(employee);
        System.out.println(count);

        String maxSalaryEmployee = maxSalaryEmployee(employee);
        System.out.println(maxSalaryEmployee);


        System.out.println("Enter nic to find : ");
        int findNIC = scan.nextInt();
        findEmployee(employee,findNIC);


        double incrementPercent = 0;
        System.out.println("how much want to increment");
        incrementPercent = scan.nextDouble();

        employee = incrementSalary(employee, incrementPercent);
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].employeeName);
            System.out.println(employee[i].employeeSalary);
        }

    }

    public static int salaryCount(EmplyeeData[] employee) {
        int count = 0;
        for (EmplyeeData salaryCount : employee) {
            if (salaryCount.employeeSalary >= 75000) {
                count++;
            }
        }
        return count;
    }

    public static String maxSalaryEmployee(EmplyeeData[] employee) {
        int maxSalary = 0;
        String maxName = null;
        EmplyeeData salary = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].employeeSalary > salary.employeeSalary) {
                salary = employee[i];
                maxSalary = i;
                maxName = employee[i].employeeName;
            }
        }
        return maxName;
    }

    public static EmplyeeData findEmployee(EmplyeeData[] employeesArrr, int finderNIC){
        EmplyeeData foundEmployee = employeesArrr[0];
        for(int i=0; i< employeesArrr.length;i++){
            EmplyeeData employee = employeesArrr[i];
            if(employee.nicNumber == finderNIC){
                foundEmployee = employeesArrr[i];
            }
        }
        return foundEmployee;
    }



    public static EmplyeeData[] incrementSalary(EmplyeeData[] employees, double incrementPercent) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].employeeSalary += employees[i].employeeSalary * (incrementPercent / 100.0);

        }
        return employees;
    }

}
