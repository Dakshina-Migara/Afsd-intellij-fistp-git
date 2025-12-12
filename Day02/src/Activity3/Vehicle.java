package Activity3;

public class Vehicle {
    private String color;
    private String model;
    private String transmitionType;

    public Vehicle(String color, String model, String transmitionType) {
        this.color = color;
        this.model = model;
        this.transmitionType = transmitionType;
    }

    public void Start() {
        System.out.println(model + " is started!");
    }
}
