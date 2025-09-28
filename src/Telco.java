import java.util.Scanner;

public class Telco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dbusername = "admin";
        int password = 123456;

        boolean isLoginSuccess = false;

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the " + (i + 1) + "username: ");
            String userName1 = scan.next();

            System.out.print("Enter the " + (i + 1) + "password: ");
            int password1 = scan.nextInt();

            if (dbusername.equals(userName1) && password1 == password) {
                isLoginSuccess = true;
                break;
            }
            if (i == 3) {
                System.out.println("login unsuccess");
            }
        }

        int dialogCount = 0;
        int mobitelCount = 0;
        int airtelCount = 0;

        if (isLoginSuccess) {

            System.out.print("Enter the target of the day: ");
            int target = scan.nextInt();
            for (int j = 0; j < target; j++) {

                System.out.print(+(j + 1) + "customer,how many sim you have: ");
                int simCount = scan.nextInt();

                for (int g = 0; g < simCount; g++) {

                    System.out.print("what the name of the " + (g + 1) + "sim card(dialog,mobitel,airtel): ");
                    String simName = scan.next();

                    switch (simName) {
                        case "dialog":
                            dialogCount++;
                            break;
                        case "mobitel":
                            mobitelCount++;
                            break;
                        case "airtel":
                            airtelCount++;
                            break;
                        default:
                            g--;
                            System.out.println("enter valid name!");
                    }
                }
            }
        }
        String popularSim = "";
        if (dialogCount == mobitelCount && mobitelCount == airtelCount) {
            popularSim = "Dialog, Mobitel, airtel (All Equal)";
        } else if (dialogCount > mobitelCount && dialogCount > airtelCount) {
            popularSim = "Dialog";
        } else if (mobitelCount > dialogCount && mobitelCount > airtelCount) {
            popularSim = "Mobitel";
        } else if (airtelCount > dialogCount && airtelCount > mobitelCount) {
            popularSim = "Hutch";
        } else if (dialogCount == mobitelCount && dialogCount > airtelCount) {
            popularSim = "Dialog & Mobitel";
        } else if (dialogCount == airtelCount && dialogCount > mobitelCount) {
            popularSim = "Dialog & airtel";
        } else if (mobitelCount == airtelCount && mobitelCount > dialogCount) {
            popularSim = "Mobitel&airtel";
        }
        System.out.println("what the most Popular sim is = " + popularSim);
    }
}
