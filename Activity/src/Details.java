import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Vehicle[] vehicle = new Vehicle[10];

        for (int i = 0; i < vehicle.length; i++) {

            System.out.println("enter vehicle type (car/van/bus/horn): ");
            String type = scan.next();

            switch (type) {
                case "car":
                    System.out.print("enter the vehicle Brand: ");
                    String brand = scan.next();

                    System.out.print("enter the vehicle Model: ");
                    String model = scan.next();

                    System.out.print("enter the vehicle color: ");
                    String color = scan.next();

                    System.out.print("enter the vehicle number of gears: ");
                    int noOfGears = scan.nextInt();

                    Car vehicle1 = new Car();
                    vehicle1.setBrand(brand);
                    vehicle1.setModel(model);
                    vehicle1.setColor(color);
                    vehicle1.setNoOfGears(noOfGears);

                    vehicle[i] = vehicle1;
                    break;

                case "van":
                    System.out.print("enter the vehicle Brand: ");
                    String brand1 = scan.next();

                    System.out.print("enter the vehicle Model: ");
                    String model1 = scan.next();

                    System.out.print("have power mirrors: ");
                    boolean isHavePowerMirror = scan.nextBoolean();

                    System.out.print("enter the vehicle price: ");
                    double price = scan.nextInt();

                    Van vehicle2 = new Van();
                    vehicle2.setBrand(brand1);
                    vehicle2.setModel(model1);
                    vehicle2.setHavePowerMirror(isHavePowerMirror);
                    vehicle2.setPrice(price);

                    vehicle[i] = vehicle2;
                    break;

                case "bus":
                    System.out.print("enter the vehicle Brand: ");
                    String brand2 = scan.next();

                    System.out.print("enter the vehicle Model: ");
                    String model2 = scan.next();

                    System.out.print("is have sensors: ");
                    boolean isSensor = scan.nextBoolean();

                    System.out.print("how many seats are in here: ");
                    int noOfSeats = scan.nextInt();

                    Bus vehicle3 = new Bus();
                    vehicle3.setBrand(brand2);
                    vehicle3.setModel(model2);
                    vehicle3.setSensor(isSensor);
                    vehicle3.setNoOfSeats(noOfSeats);

                    vehicle[i] = vehicle3;
                    break;

                case "horn":
                    for (Vehicle rathaya : vehicle) {
                        rathaya.horn();
                    }
                    break;

                default:
                    System.out.println("invalid type");
                    break;
            }
        }
    }
}