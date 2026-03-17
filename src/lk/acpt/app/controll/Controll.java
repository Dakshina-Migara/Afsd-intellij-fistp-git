package lk.acpt.app.controll;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Controll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the number 1: ");
        int num1 = scan.nextInt();

        System.out.print("enter the number 2: ");
        int num2 = scan.nextInt();

        try {
            int answer = num1 / num2;
            System.out.print("answer is : " + answer);
        } catch (ArithmeticException exception) {
            System.out.println("invalid input.....!");
        }

        try {
            String studentAge = "migara";
            int age = Integer.parseInt(studentAge);
        } catch (NumberFormatException e) {
            System.out.println("invalid");
        }

        String studentAge = "46";
        int age = Integer.parseInt(studentAge);
        System.out.println(studentAge);

        try {
            File file = new File("digudesa.mp3");
            FileReader reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("file not found.....!");
        }


        //balen exception ekak hadawala thiyenne
        int num3 = 17;

        if (18 < num3) {
            throw new ArithmeticException();
        }


        //custom exception
        int num4 = 18;
        if (18<num4){
            throw new MigaraException("age is too much...");
        }



        try {
            dance();
            System.out.println("dance");
        } catch (NumberFormatException exx) {
            System.out.println("hi");
        } finally {
            System.out.println("koma unath weda");
        }

    }

    public static void dance() throws NumberFormatException {

        String studentAge = "56";
        int age = Integer.parseInt(studentAge);
    }
}
