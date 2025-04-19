import java.util.Scanner;

public class GarageBillingApp {
    public static void main(String[] args) {
        GarageServices  garageServices = new GarageServices();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("---------Shubham Garage service---------");
            System.out.println("1:Add customer");
            System.out.println("2:Offered Services");
            System.out.println("3: Exit");
            System.out.println("4:  Wheel Alignment");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter customer name");
                    String name = sc.next();
                    System.out.println("Enter phone number");
                    String phone = sc.next();
                    System.out.println("Enter car number");
                    String carNumber = sc.next();
                    System.out.println("Enter car Model");
                    String model = sc.next();
                    garageServices.addCustomer(name,phone,carNumber,model);
                    break;
                case 2:
                    System.out.println("Enter car number");
                    String carNo = sc.next();
                    garageServices.createInvoice(carNo);
                    break;
                case 3:
                    System.out.println("Exiting....Thank You!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
            }



        }
    }
}
