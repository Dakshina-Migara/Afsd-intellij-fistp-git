import java.util.Scanner;
public class Trace {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);

        System.out.print("what the age of him: ");
        int val1 = scan.nextInt();

        if (val1>=18){

            System.out.print("what the name of him: ");
            String val2 =scan.next();

            if (val1%2 == 0){
                System.out.println("even,"+val2);
            }else {
                System.out.println("odd,"+val2);
            }
        }else {
            System.out.println("nope");
        }
    }
}
