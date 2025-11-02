public class ObjectClass {
    public static void main(String[] args) {

        CarClass car = new CarClass();
        System.out.println(car);

        CustomerService service = new CustomerServiceImpl();
        service.deleteCustomer();
    }
}
