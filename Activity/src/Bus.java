public class Bus extends Vehicle {

    private boolean isSensor;
    private int noOfSeats;

    public boolean isSensor() {
        return isSensor;
    }

    public void setSensor(boolean sensor) {
        isSensor = sensor;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public void horn() {
        System.out.println("poop poop");
    }
}
