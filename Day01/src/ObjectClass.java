public class ObjectClass {
    public static void main(String[] args) {

        CarClass car = new CarClass();
        System.out.println(car);

        CustomerService service = new CustomerServiceImpl();
        service.deleteCustomer();

        ComileTime time = new ComileTime();
        time.play(10);

        //super
        RunTime2 b = new RunTime();


        //records
        Animal animal = new Animal("lion", 34, 4);
        System.out.println(animal.age());
        System.out.println(animal.name());
        System.out.println(animal.noOfLegs());



    }
}
