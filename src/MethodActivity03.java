import java.util.Scanner;

public class MethodActivity03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] studentName = new String[2];
        int[][] subjectMark = new int[2][6];

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter the " + i + " Student Name: ");
            studentName[i] = scan.next();

            for (int k = 0; k < 6; k++) {
                System.out.print("Enter the " + k + " Subject Mark: ");
                subjectMark[i][k] = scan.nextInt();
            }
        }

        int[] total = totalMarks(studentName, subjectMark);
        for (int i = 0; i < total.length; i++) {
            System.out.println(studentName[i] + " all subject total is:" + total[i]);
        }

        double[] average = findAverage(total, subjectMark);
        for (int i = 0; i < total.length; i++) {
            System.out.println(studentName[i] + " average total is: " + average[i]);
        }


        String maSalary = maxMarkedStudent(studentName, subjectMark);
        System.out.println("Highest Marked student is: " + maSalary);


        int select = parentMeetingEligible(average);
        System.out.println("Parent meeting selected student total: " + select);
    }

    public static int[] totalMarks(String[] studentName, int[][] subjectMark) {
        int[] total2 = new int[subjectMark.length];
        for (int i = 0; i < studentName.length; i++) {
            int total = 0;
            for (int k = 0; k < 6; k++) {
                total += subjectMark[i][k];
            }
            total2[i] = total;
        }
        return total2;
    }

    public static double[] findAverage(int[] total, int[][] subjectMark) {
        double[] average = new double[total.length];
        for (int i = 0; i < total.length; i++) {
            average[i] = (double) total[i] / subjectMark[i].length;
        }
        return average;
    }


    public static String maxMarkedStudent(String[] studentName, int[][] subjectMark) {
        int maxMarked = 0;
        int maxMarkedIndex = 0;
        for (int i = 0; i < studentName.length; i++) {
            int marked = 0;
            for (int k = 0; k < 6; k++) {
                marked += subjectMark[i][k];

                if (marked > maxMarked) {
                    maxMarked = subjectMark[i][k];
                    maxMarkedIndex = i;
                }
            }
        }
        return studentName[maxMarkedIndex];
    }

    public static int parentMeetingEligible(double[] average) {
        int totalStudent = 0;
        for (int i = 0; i < average.length; i++) {
            if (average[i] <= 40) {
                totalStudent++;
            }
        }
        return totalStudent;
    }
}
