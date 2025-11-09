import java.util.Scanner;

public class MethodActivity01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] boyName = new String[17];
        String[] girlName = new String[17];

        //get the boy name when user input
        for (int i = 0; i < 17; i++) {
            System.out.print("enter the " + i + 1 + " boy name: ");
            boyName[i] = scan.next();

            System.out.print("enter the " + i + 1 + " Girl name: ");
            girlName[i] = scan.next();
        }

        matchCouple(boyName, girlName);
    }

    public static void matchCouple(String[] boyName, String[] girlName) {
        int matchCoupleCount = 0;

        for (int i = 0; i < boyName.length; i++) {
            char firstCharBoy = boyName[i].charAt(0);
            char lastCharGirl = girlName[i].charAt(girlName[i].length() - 1);

            if (firstCharBoy > lastCharGirl) {
                matchCoupleCount++;
            }
        }
        System.out.println(matchCoupleCount);
    }
}

