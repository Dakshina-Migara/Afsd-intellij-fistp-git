package Activity1;

public class Teacher {
     private String teacherName;
     private int teacherAge;
     private String teacherAddress;


    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(int teacherAge) {
        this.teacherAge = teacherAge;
    }

    public String getTeacherAddress() {
        return teacherAddress;
    }

    public void setTeacherAddress(String teacherAddress) {
        this.teacherAddress = teacherAddress;
    }

    public void display(){
        System.out.println("teacher name: " + teacherName + "teacher age: " + teacherAge + "teacher address: " + teacherAddress);

    }
}
