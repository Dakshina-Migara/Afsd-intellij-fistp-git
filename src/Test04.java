import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("what the name of the boy - ");
        String boyName = scan.next();

        System.out.print("what the name of the girl - ");
        String girlName = scan.next();

        char firstChar = boyName.charAt(0);
        int firstChar1 = firstChar;

        char lastChar = girlName.charAt(girlName.length() - 1);
        int lastChar1 = lastChar;

        System.out.println("Lucky number is : " + (firstChar1 + lastChar1) / 2);
    }
}

