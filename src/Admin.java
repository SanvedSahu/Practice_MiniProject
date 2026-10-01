import java.util.Scanner;

public class Admin extends Person {

    //    static Scanner sc = new Scanner(System.in);
    private final static String adminUserName = "admin";
    private final static String adminPassword = "admin@123";

    public Admin(int personId, String name, long mobileNo, String email) {
        super(personId, name, mobileNo, email);
    }

    public static boolean authenticate(String userName, String password) {
        if (userName.equals(adminUserName) && password.equals(adminPassword)) {
            return true;
        } else
            return false;
    }

    public void addUser() {

        System.out.print("\nEnter User ID : ");
        int userId = Main.sc.nextInt();
        System.out.print("Enter User Name : ");
        String userName = Main.sc.next();
        System.out.print("Enter User Mobile No. : ");
        long userMobileNo = Main.sc.nextLong();
        System.out.print("Enter User Email : ");
        String userEmail = Main.sc.next();
        if (SystemInventory.findUserById(userId) == null) {
            User newUser = new User(userId, userName, userMobileNo, userEmail);
            SystemInventory.addUser(newUser);
        } else {
            System.out.println("\nUser already Exists !!! ");
        }

    }

    public void removeUser() {
        System.out.print("\nEnter User ID : ");
        int userId = Main.sc.nextInt();
        User userAddr = SystemInventory.findUserById(userId);
        if (userAddr != null) {
            SystemInventory.removeUser(userAddr);
        } else {
            System.out.println("User Does Not Exists !!! ");
        }
    }

    public void viewAllUsers() {
        SystemInventory.viewAllUsers();
    }

    public void addServiceProvider() {

        System.out.println("\n========== ADD SERVICE PROVIDER ==========");
        System.out.println("1. Veterinarian\n2. Pet Groomer\n3. Pet Trainer");
        System.out.println("==========================================");
        System.out.print("\nEnter Service Provider to Add From Above Option : ");
        int ch = Main.sc.nextInt();

        System.out.print("\nEnter Service Provider ID : ");
        int serviceProviderId = Main.sc.nextInt();
        System.out.print("Enter Service Provider Name : ");
        String serviceProviderName = Main.sc.next();
        System.out.print("Enter Mobile No. of Service Provider : ");
        long serviceProviderMobileNo = Main.sc.nextLong();
        System.out.print("Enter Email of Service Provider : ");
        String serviceProviderEmail = Main.sc.next();
        System.out.print("Enter Experience (In Years ) : ");
        double experience = Main.sc.nextDouble();
        Main.sc.nextLine();
        System.out.print("Enter Specialization : ");
        String specification = Main.sc.nextLine();

        switch (ch) {
            case 1 -> {
                String serviceProviderType = "Veterinarian";
                Main.sc.next();
                System.out.print("Enter Clinic Name : ");
                String clinicName = Main.sc.nextLine();
                System.out.print("Enter Consultation Fee : ");
                double fee = Main.sc.nextDouble();
                if (SystemInventory.findServiceProviderById(serviceProviderId) == null) { // if service Provider already exist or not , if not then add
                    Veterinarian vet = new Veterinarian(serviceProviderId, serviceProviderName, serviceProviderMobileNo, serviceProviderEmail, serviceProviderType, experience, specification, clinicName, fee);
                    SystemInventory.addServiceProvider(vet);
                } else {
                    System.out.println("\nService Provider Already Exists !!!");
                }

            }
            case 2 -> {
                String serviceProviderType = "Pet Groomer";
                Main.sc.nextLine();
                System.out.print("Enter Grooming Type : ");
                String groomingType = Main.sc.nextLine();
                System.out.print("Enter Grooming Fee : ");
                double fee = Main.sc.nextDouble();
                if (SystemInventory.findServiceProviderById(serviceProviderId) == null) { // if service Provider already exist or not , if not then add
                    PetGroomer petGroomer = new PetGroomer(serviceProviderId, serviceProviderName, serviceProviderMobileNo, serviceProviderEmail, serviceProviderType, experience, specification, groomingType, fee);
                    SystemInventory.addServiceProvider(petGroomer);
                } else {
                    System.out.println("\nService Provider Already Exists !!!");
                }

            }
            case 3 -> {
                String serviceProviderType = "Pet Trainer";
                Main.sc.next();
                System.out.print("Enter Training Type : ");
                String trainingType = Main.sc.nextLine();
                System.out.print("Enter Training Fee : ");
                double fee = Main.sc.nextDouble();
                if (SystemInventory.findServiceProviderById(serviceProviderId) == null) { // if service Provider already exist or not , if not then add
                    PetTrainer petTrainer = new PetTrainer(serviceProviderId, serviceProviderName, serviceProviderMobileNo, serviceProviderEmail, serviceProviderType, experience, specification, trainingType, fee);
                    SystemInventory.addServiceProvider(petTrainer);
                } else {
                    System.out.println("\nService Provider Already Exists !!!");
                }

            }
            default -> System.out.println("\nInvalid Service Provider!!!");
        }


    }

    public void removeServiceProvider() {
        System.out.println("\nEnter Service Provider Id To Remove : ");
        int id = Main.sc.nextInt();
        ServiceProvider serviceProviderAddr =  SystemInventory.findServiceProviderById(id);
        if (serviceProviderAddr != null){
            SystemInventory.removeServiceProvider(serviceProviderAddr);
        }else {
            System.out.println("\nService Provider Not Found !!! ");
        }
    }

    public void viewAllProviders() {
        SystemInventory.viewAllServiceProvider();
    }

    public void addService() {
    }

    public void removeService() {
    }



    public void viewAllBookings() {
    }

}
