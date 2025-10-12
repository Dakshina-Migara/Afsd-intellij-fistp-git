import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }

        getTotal();

        findNumber();
    }

    //method
    //    void -->return type
    //    getTotal --> method name (getTotal , get_total)
    public static void getTotal() {
        System.out.println("hi.......");
    }



      //find the input number odd or even

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
}
