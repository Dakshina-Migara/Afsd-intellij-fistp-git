package Activity3;

public class Details {
    public static void main(String[] args) {

        Van van = new Van("white", "Delica", "Automatic");
        Car car1 = new Car("Red", "Allion", "Automatic");
        Car car2 = new Car("Gold", "Yaris", "Manual");
        Car car3 = new Car("Blue", "Yaris", "Manual");
        Vehicle[] vehicleList = {van, car1, car2, car3};


        for (Vehicle v : vehicleList) {
            v.Start();
        }

    }
}
