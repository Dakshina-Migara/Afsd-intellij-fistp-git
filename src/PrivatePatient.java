import java.util.Scanner;

public class PrivatePatient {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Private[] patients = new Private[3];

        for (int i = 0; i < patients.length; i++) {

            System.out.print("Enter name for patient " + (i + 1) + ": ");
            String patientName = scan.next();

            System.out.print("Enter age for patient " + (i + 1) + ": ");
            int patientAge = scan.nextInt();

            Private patient = new Private();
            patient.patientName = patientName;
            patient.patientAge = patientAge;

            patients[i] = patient;
        }

        int teenCount = countTeenagePatients(patients);
        System.out.println("Number of teenage patients: " + teenCount);
    }

    public static int countTeenagePatients(Private[] patients) {
        int count = 0;
        for (Private patientAge: patients) {
            if (patientAge.patientAge >= 13 && patientAge.patientAge <= 19) {
                count++;
            }
        }
        return count;
    }
}