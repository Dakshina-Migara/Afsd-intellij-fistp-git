package Activity2;

import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Engineer e1 = new Engineer("Mr. Kamal", "Civil Engineer", 85000.00);
        Engineer e2 = new Engineer("Mr. Siridasa", "Planning Engineer", 80000.00);
        Engineer e3 = new Engineer("Mr. Sugathadasa", "Electrical Engineer", 95000.00);
        Engineer e4 = new Engineer("Mrs. Nayani", "Planning Engineer", 75000.00);
        Engineer[] engineers = {e1, e2, e3, e4};


        System.out.print("Enter engineer name to search: ");
        String engineerName = scan.nextLine();

        Engineer foundEngineer = getEngineerDetails(engineerName, engineers);

        if (foundEngineer != null) {
            System.out.println("Engineer Found:");
            foundEngineer.displayDetails();
        } else {
            System.out.println("Engineer not found!");
        }

        scan.close();

        // Print all engineer details
        System.out.println("=== All Engineer Details ===");
        for (Engineer eng : engineers) {
            eng.displayDetails();
        }

    }

    public static Engineer getEngineerDetails(String engineerName, Engineer[] engineers) {
        for (Engineer eng : engineers) {
            if (eng.getEngineerName().equals(engineerName)) {
                return eng; // Return the matching engineer
            }
        }
        return null;
    }
}
