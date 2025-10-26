import java.util.Scanner;

public class MethodActivity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] ages = new int[21];

        for (int i = 0; i < 21; i++) {
            System.out.print("enter the age: ");
            ages[i] = scan.nextInt();
        }

        System.out.print("enter the age limit: ");
        int ageLimit = scan.nextInt();

        getCount(ages ,ageLimit);

    }

    public static void getCount(int[] ages, int ageLimit) {
        int total = 0;
        for(int i = 0; i < ages.length; i++) {
            if (ages[i] == ageLimit) {
                total++;
            }
        }
        System.out.println(total);
    }
}
