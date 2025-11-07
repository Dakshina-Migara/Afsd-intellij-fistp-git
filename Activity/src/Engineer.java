public class Engineer extends Employee {
    private double engineerSalary;
    private String engineerUniversity;
    private int engineerCount;

    public Engineer(int engineerCount) {
        this.engineerCount = engineerCount;
    }

    public double getEngineerSalary() {
        return engineerSalary;
    }

    public void setEngineerSalary(double engineerSalary) {
        this.engineerSalary = engineerSalary;
    }

    public String getEngineerUniversity() {
        return engineerUniversity;
    }

    public void setEngineerUniversity(String engineerUniversity) {
        this.engineerUniversity = engineerUniversity;
    }

    public void duty() {
        System.out.println("Engineer " + getEmployeeName() + " duty " + engineerCount);
    }

}
