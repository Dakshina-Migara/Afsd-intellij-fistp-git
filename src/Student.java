
//original common data sheet
public class Student {

    String name;
    //static variable
    static int age;
    double salary;
    boolean isSmoke;
    String address;


    //static method
    //mekedi apita non-static method kiya variable ekakwath call karanna denne ne
    public static void dance() {
        System.out.println(age);
    }

    public static void age() {
    }


    //non-static method
    //mekedi static method wage static variable pawa call karanna puluawan
    public void sing() {
        dance();
        System.out.println(age);
    }
}
