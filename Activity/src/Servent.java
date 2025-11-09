public class Servent extends Employee {
    private String serventDepartment;
    private String serventAddress;
    private int serventCount;

    public Servent(int serventCount) {
        this.serventCount = serventCount;
    }

    public String getServentDepartment() {
        return serventDepartment;
    }

    public void setServentDepartment(String serventDepartment) {
        this.serventDepartment = serventDepartment;
    }

    public String getServentAddress() {
        return serventAddress;
    }

    public void setServentAddress(String serventAddress) {
        this.serventAddress = serventAddress;
    }

    public void duty() {
        System.out.println("Servent " + getEmployeeName() + " duty " + serventCount);
    }

}
