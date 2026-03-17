package Activity4;

import java.util.Scanner;

public class PersonDetails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Person[] details = new Person[1];

        int index = 0;
        int choice = 0;

        while (choice != 1) {
            System.out.println("choose the once!....");
            System.out.println("1. enter the details");
            System.out.println("2. get all details");
            System.out.println("3. exit");

            switch (choice) {
                case 1:
                    if (index < details.length) {
                        System.out.print("enter the name: ");
                        String name = scan.next();

                        System.out.print("enter the age: ");
                        int age = scan.nextInt();

                        System.out.print("enter the address: ");
                        String address = scan.next();

                        System.out.print("enter the status: ");
                        String status = scan.next();

                        Person p = new Person();
                        p.setName(name);
                        p.setAge(age);
                        p.setAddress(address);
                        p.setStatus(status);
                        details[index] = p;
                        index++;

                        System.out.println("success person added!.......");
                    } else {
                        System.out.println("No more space to add persons!");
                    }
                    break;

                case 2:
                    getAll(details);
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
            break;
        }
    }


    public static void getAll(Person[] details) {
        for (Person p : details) {
            p.printDetails();
        }
    }
}
