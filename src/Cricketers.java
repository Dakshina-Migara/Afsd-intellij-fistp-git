public class Cricketers {
    private String name;
    private int age;
    private String address;
    private double salary;


    //encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 100) {
            this.age = age;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


//    //constructor
//    public Cricketers(){
//        System.out.println("hi...!");
//    }
//
//     //instance block--->initialize default value to instance variable
//    {
//        employeeName = null;
//        employeeAge = 0;
//        address = null;
//        employeeSalary = 0.0;
//        System.out.println("instance block");
//    }
//
//
//    //static block--->initialize default value to static variables and methods
//    static {
//        System.out.println("static block");
//    }
//
//    //me welawe run wena object eke data thama api ganna ona
//    public Cricketers(String employeeName,String address,int employeeAge,double employeeSalary){
//       this.employeeName = employeeName;
//       this.address = address;
//       this.employeeAge = employeeAge;
//       this.employeeSalary = employeeSalary;
//    }


}
