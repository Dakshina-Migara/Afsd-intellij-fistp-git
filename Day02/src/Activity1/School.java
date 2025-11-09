package Activity1;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Teacher[] teacher = new Teacher[3];

        for (int i = 0; i < teacher.length; i++) {

            System.out.print("enter the teacher name: ");
            String teacherName = scan.next();

            System.out.print("enter the teacher address: ");
            String teacherAddress = scan.next();

            System.out.print("enter the teacher age: ");
            int teacherAge = scan.nextInt();

            Teacher teach = new Teacher();
            teach.setTeacherName(teacherName);
            teach.setTeacherAddress(teacherAddress);
            teach.setTeacherAge(teacherAge);
            teacher[i] = teach;
        }

        for (Teacher disply:teacher){
            disply.display();
        }
    }
}
