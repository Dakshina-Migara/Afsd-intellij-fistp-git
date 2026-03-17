package Activity2;

public class Engineer {
    private String engineerName;
    private String engineerType;
    private double engineerSalary;

    public Engineer(String engineerName, String engineerType, double engineerSalary) {
        this.setEngineerName(engineerName);
        this.setEngineerType(engineerType);
        this.setEngineerSalary(engineerSalary);
    }


    public String getEngineerName() {
        return engineerName;
    }

    public void setEngineerName(String engineerName) {
        this.engineerName = engineerName;
    }

    public String getEngineerType() {
        return engineerType;
    }

    public void setEngineerType(String engineerType) {
        this.engineerType = engineerType;
    }

    public double getEngineerSalary() {
        return engineerSalary;
    }

    public void setEngineerSalary(double engineerSalary) {
        this.engineerSalary = engineerSalary;
    }

    public void displayDetails() {
        System.out.println("Name: " + engineerName);
        System.out.println("Designation: " + engineerType);
        System.out.println("Salary: Rs." + engineerSalary);
        System.out.println("---------------------------");
    }
}