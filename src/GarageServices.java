import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GarageServices {
     private  Map<String , Customer> CustomersMap;
     private List<Service> availableServices;

    public GarageServices(Map<String, Customer> customersMap, List<Service> availableServices) {
        this.CustomersMap = new HashMap<>();
        this.availableServices = new ArrayList<>();
    }
    public void addCustomer(String name , String phone, String carNumber , String model){
        Car car = new Car(carNumber , model);
        Customer customer = new Customer(name, phone, car);
        System.out.println("Customer added Successfully");






    }
    public void createInvoice(String carNumber){
        if(!CustomersMap.containsKey(carNumber))
        {
            System.out.println("No Customer Found with car Number" + carNumber);
            return;
        }
        System.out.println("Available Services ");
        for(int i=0; i<availableServices.size();i++){
            System.out.println((i+1)+ " "+ availableServices.get(i).getName()+" "+ availableServices.get(i).getPrice());




        }
        while (true){
            System.out.println("Enter Service number to add");

        }


    }

}
