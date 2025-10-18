import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }

        getTotal();

        findNumber();

        System.out.print("enter the number: ");
        int inputNumber2 = scan.nextInt();

        findNumber2(inputNumber2);


        //return
        String name = findNumber3(inputNumber2);


        getSum("migara");

    }

    //method
    //    void -->return type
    //    getTotal --> method name (getTotal , get_total)
    public static void getTotal() {
        System.out.println("hi.......");
    }

    /// ////////////////////////////////////////////////////////
    //find the input number odd or even
    //Normal Method
    public static void findNumber() {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the number: ");
        int inputNumber = scan.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.println("it's even");
        } else {
            System.out.println("it's odd");
        }
    }

    /// ///////////////////////////////////////////////////////////
    //Parameterized methods     = method name ekata parameter ekak use karanawa eka api main method ekata pass karanna ona
    //apita main method ekema inputs walata scanner ekak daganna puluwan ethakota call karala thiyena method name ekata input wala parameter name eka pass karanna thiyenne
    //()---->parameter Bracket
    public static void findNumber2(int inputNumber2) {
        if (inputNumber2 % 2 == 0) {
            System.out.println("it's even");
        } else {
            System.out.println("it's odd");
        }
    }


    //return method
    public static String findNumber3(int inputNumber2) {
        if (inputNumber2 % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    //variable argument----->varargs
    public static void getSum(String name, int... data) {
        System.out.println(data[0]);
    }

}
