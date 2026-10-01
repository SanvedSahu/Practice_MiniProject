import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        initializeSampleProviders();

        boolean flag = true;
        while(flag){
            System.out.println("\n=========== PET CARE SERVICE PLATFORM ============");
            System.out.println("1.Admin\n2.Service Provider\n3.User\n4.Exit");
            System.out.println("==================================================");
            System.out.print("\nEnter Your Choice From Above Options : ");
            int ch = sc.nextInt();
            switch (ch){
                case 1->{
                    showAdminMenu();
                }
//                case 2 ->
//                case 3 ->
                case 4 -> flag = false;
                default -> System.out.println("\nInvalid Choice Entered !!! ");
            }

        }

    }

    private static void initializeSampleProviders() {
        SystemInventory.addServiceProvider(new Veterinarian(
                101, "Dr. Rahul Sharma", 9876543210L,
                "rahul.vet@example.com", "Veterinarian", 8.5,
                "Pet Surgery", "Happy Paws Clinic", 800.0
        ));

        SystemInventory.addServiceProvider(new PetGroomer(
                103, "Amit Patil", 9988776655L,
                "amit.groomer@example.com", "Pet Groomer", 4.5,
                "Dog Grooming", "Full Body Grooming", 500.0
        ));

        SystemInventory.addServiceProvider(new PetTrainer(
                105, "Rohit Kulkarni", 9765432109L,
                "rohit.trainer@example.com", "Pet Trainer", 6.0,
                "Dog Training", "Obedience Training", 700.0
        ));
    }

    public static void showAdminMenu() {

//        boolean flag = true;
//        while(flag){
            System.out.print("Enter Admin's User Name : ");
            String userName = sc.next();
            System.out.print("Enter Admin's Password : ");
            String password = sc.next();

            if(Admin.authenticate(userName,password)){
                Admin admin = new Admin(1111,"Admin",1234564L,"sanvedsahu2129e@gmail.com");
                boolean flag = true;
                while(flag){
                    System.out.println("\n========= Admin's Menu ============");
                    System.out.println("1.Add User");
                    System.out.println("2.Remove User");
                    System.out.println("3.View All Users");
                    System.out.println("4.Add Service Provider");
                    System.out.println("5.Remove Service Provider");
                    System.out.println("6.View All Service Providers");
                    System.out.println("7.Exit");

                    System.out.print("\nEnter Your Choice From Above : ");
                    int ch = sc.nextInt();
                    switch (ch){
                        case 1->{
                            admin.addUser();
                        }
                        case 2->{
                            admin.removeUser();
                        }
                        case 3 ->{
                            admin.viewAllUsers();
                        }
                        case 4->{
                            admin.addServiceProvider();
                        }
                        case 5->{
                            admin.removeServiceProvider();
                        }
                        case 6->{
                            admin.viewAllProviders();
                        }
                        case 7-> flag = false;
                        default -> System.out.println("\nInvalid Choice !!! ");

                    }
                }
            }else{
                System.out.println("\nInvalid Credentials !!! ");
            }
//        }
    }

}
