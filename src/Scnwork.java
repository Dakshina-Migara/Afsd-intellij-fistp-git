// import the Scanner(api issellama add karagena inna ona scnner eka mekata)

import java.util.Scanner;

public class Scnwork {
    public static void main(String[] args) {

        //Scanner setup (add karagaththa scanner eka api mekedi setup karagannawa)
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int val1 = scan.nextInt();

        System.out.print("Enter number 2 : ");
        int val2 = scan.nextInt();

        int answer = val1 + val2;
        System.out.println(answer);

        //String ---> scan.next()
        //double ---> scan.nextdouble()
    }
}
