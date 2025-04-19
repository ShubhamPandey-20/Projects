import java.util.List;

public class Invoice {
    private Customer customer;
    private List<Service> serviceList;
    private double totalAmount;

    public Invoice(Customer customer, List<Service> serviceList, double totalAmount) {
        this.customer = customer;
        this.serviceList = serviceList;
        this.totalAmount = totalAmount;
    }
    public void addService(Service service){
        serviceList.add(service);
        totalAmount+=service.getPrice();
    }

    public void printInvoice(){
        System.out.println("-------Invoice-------");
        System.out.println("Customer"+ customer.getName()+ "| Phone" + customer.getPhone());
        System.out.println("Car" +customer.getCar().getModel()+ "Car number" +customer.getCar().getCarNumber());
        System.out.println("Services");
        for(Service service:serviceList){
            System.out.println("#"+service.getName()+":$"+ service.getPrice());
        }
        System.out.println("Total Amount" + totalAmount);
        System.out.println("-------Thank you-------");

    }
}
