import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int val1 = 23;
        val1 = val1 + 3;
        System.out.println(val1);//increment operators

        int val2 = 23;
        val2 += 3;
        System.out.println(val2);//ekak ekathu wela val2 ekata samanai

        int val3 = 23;
        val3++;
        System.out.println(val3);//post increment

        int val6 = 23;
        ++val6;
        System.out.println(val6);//pre increment

        int val4 = 23;
        System.out.println(val4++);//post increment ekedi eka para weda 2k karanne ne

        int val5 = 23;
        System.out.println(++val5);//pre increment ekedi eya ekathu kargena print wenawa

    }
}
