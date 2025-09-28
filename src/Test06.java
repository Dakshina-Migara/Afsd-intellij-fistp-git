import java.util.Scanner;
public class Test06 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("what the Age the boy - ");
        int boyAge = scan.nextInt();

        System.out.print("what the Age of the girl - ");
        int girlAge = scan.nextInt();

        if (boyAge>=girlAge){
            System.out.print("what the name of the boy - ");
            String boyName = scan.next();

            System.out.print("what the name of the girl - ");
            String girlName = scan.next();

            char firstChar = boyName.charAt(0);
            int firstChar1 = firstChar;

            char lastChar = girlName.charAt(girlName.length()-1);
            int lastChar1 = lastChar;

            if (firstChar1>lastChar1){
                System.out.println("marry me");
            }else {
                System.out.println("bla bla bla");
            }

        } else if (boyAge==girlAge) {
            System.out.println("think twice");

        } else if (boyAge<girlAge) {
            System.out.println("maybe");
        }

    }
}
