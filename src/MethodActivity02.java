import java.util.Scanner;

public class MethodActivity02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = {5, 10, 15, 20, 25};

        System.out.print("enter the value: ");
        int enterValue = scan.nextInt();

        boolean falseT = findAvailability(arr, enterValue);
        System.out.println(falseT);
    }

    //array searching interview question / algorithm
    public static boolean findAvailability(int[] arr, int enterValue) {
        for (int i = 0; i < arr.length; i++) {
            if (enterValue == arr[i]) {
                return true;
            }
        }
        return false;
    }
}