//copy of the common original data sheet
public class OopPractice {
    public static void main(String[] args) {

        Student data = new Student();
        data.name = "migara";
        data.address = "pallama";
        data.age = 22;
        data.isSmoke = false;
        data.salary = 5000;

        Student data2 = new Student();
        System.out.println(data2.age);

        Student.dance();
        Student.age=43;

    }
    public static void getsum(){
        Student.age();
    }
}
