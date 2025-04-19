import java.util.*;

public class GarageServices {
     private  Map<String , Customer> CustomersMap;
     private List<Service> availableServices;

    public GarageServices() {
        this.CustomersMap = new HashMap<>();
        this.availableServices = new ArrayList<>();
        loadServices();
    }
    public void loadServices(){
        availableServices.add(new Service("car wash" , 500));
        availableServices.add(new Service("Oil change" , 700));
        availableServices.add(new Service("Wheel alignment" , 300));
        availableServices.add(new Service("Tyre replacement" , 3000));
        availableServices.add(new Service("Puncture" , 50));
    }
    public void addCustomer(String name , String phone, String carNumber , String model){
        Car car = new Car(carNumber , model);
        Customer customer = new Customer(name, phone, car);
        CustomersMap.put(carNumber, customer);
        System.out.println("Customer added Successfully");






    }
    public void createInvoice(String carNumber){
        if(!CustomersMap.containsKey(carNumber))
        {
            System.out.println("No Customer Found with car Number" + carNumber);
            return;
        }
        Scanner sc = new Scanner(System.in);
        Customer customer = CustomersMap.get(carNumber);
        Invoice invoice = new Invoice(customer);


        System.out.println("Available Services ");
        for(int i=0; i<availableServices.size();i++){
            System.out.println((i+1)+ " "+ availableServices.get(i).getName()+" "+ availableServices.get(i).getPrice());




        }
        while (true){
            System.out.println("Enter Service number to add (Or 0 to finish");
            int choice = sc.nextInt();
            if(choice==0){
                break;
            }
            if(choice>0 && choice<=availableServices.size()){
                invoice.addService(availableServices.get(choice-1));
                System.out.println("Service done");


            }
            else{
                System.out.println("Invalid service");

            }




        }
        invoice.printInvoice();


    }

}
