public class Manager extends Employee {
    private int managerAge;
    private String managerQualification;
    private int managerCount;

    public Manager(int managerCount) {
        this.managerCount = managerCount;
    }

    public int getManagerAge() {
        return managerAge;
    }

    public void setManagerAge(int managerAge) {
        this.managerAge = managerAge;
    }

    public String getManagerQualification() {
        return managerQualification;
    }

    public void setManagerQualification(String managerQualification) {
        this.managerQualification = managerQualification;
    }

    public void duty() {
        System.out.println("Manager " + getEmployeeName() + " duty " + managerCount);
    }

}
