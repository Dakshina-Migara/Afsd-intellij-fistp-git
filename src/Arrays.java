import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //array
        //type safe ---> same data type
        //fixed length
        int age = 5; //single
        System.out.print(age);

        int[] ages = new int[5];

        for (int h = 0; h < 5; h++) {
            System.out.println("enter the val" + h);
            ages[h] =scan.nextInt();

            ages[3] = 54;
            System.out.println(ages[0]);

            for (int i = 0; i < 5; i++) {
                System.out.println("enter the value" + i);
                ages[i] = scan.nextInt();
            }
        }
    }
}
