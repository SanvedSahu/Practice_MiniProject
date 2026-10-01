import java.util.ArrayList;

public class SystemInventory {

    static ArrayList<Service> servicesList = new ArrayList<Service>();
    static ArrayList<ServiceProvider> serviceProviderList = new ArrayList<ServiceProvider>();
    static ArrayList<User> usersList = new ArrayList<User>();

    public static User findUserById(int userId){
        for(User usrAddr : usersList){
            if(usrAddr.getPersonId()==userId)
                return usrAddr;
        }
        return null;
    }

    public static ServiceProvider findServiceProviderById(int serviceProviderId){
        for(ServiceProvider serviceProviderAddr : serviceProviderList){
            if(serviceProviderAddr.getPersonId()==serviceProviderId)
                return serviceProviderAddr;
        }
        return null;
    }

    // Users
    public static void addUser(User newUser){
        usersList.add(newUser);
        System.out.println("\nNew User Added Successfully !!!");
    }

    public static void removeUser(User userAddr){
        usersList.remove(userAddr);
        System.out.println("\nUser Removed Successfully !!!");
    }

    public static void viewAllUsers(){
        if(!usersList.isEmpty()){
            System.out.println("\n+--------------------ALL USER INFORMATION----------------------+");
            System.out.println("|\tUser Id\t|\tName\t|\tMobile No.\t|\tEmail-Id\t|");
            System.out.println("-----------------------------------------------------------------");
            for(User usrAddr : usersList){
                System.out.println("|\t"+usrAddr.getPersonId()+"\t|\t"+usrAddr.getName()
                        +"\t|\t"+usrAddr.getMobileNo()+"\t|\t"+usrAddr.getEmail()+"\t|");
            }
            System.out.println("-----------------------------------------------------------------");
        }else{
            System.out.println("\nNO Users ");
        }

    }

    // Service Providers
    public static void addServiceProvider(ServiceProvider newServiceProvider){
        serviceProviderList.add(newServiceProvider);
        System.out.println("\nNew Service Provider Added Successfully !!!");
    }

    public static void removeServiceProvider(ServiceProvider serviceProviderAddr){
        serviceProviderList.remove(serviceProviderAddr);
        System.out.println("\nService Provider Removed Successfully !!!");
    }

    public static void viewAllServiceProvider() {

        if (!serviceProviderList.isEmpty()) {

            System.out.println("\n+---------------------------------------------------- ALL SERVICE PROVIDER INFORMATION ---------------------------------------+");
            System.out.println("|\t User ID \t|\t User Name \t|\t Mobile No. \t|\t\t\t Email ID \t\t\t|\t Type \t|\t Experience \t|\t Specialization \t|");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

            for (ServiceProvider sp : serviceProviderList) {

                System.out.println("|\t\t" + sp.getPersonId()
                        + "\t\t|\t" + sp.getName()
                        + "\t|\t" + sp.getMobileNo()
                        + "\t|\t" + sp.getEmail()
                        + "\t|\t" + sp.getProviderType()
                        + "\t|\t" + sp.getExperience()
                        + "\t|\t" + sp.getSpecialization()
                        + "\t|");
            }

            System.out.println("--------------------------------------------------------------------------------");

        } else {
            System.out.println("\nNO SERVICE PROVIDERS");
        }
    }



    public void removeService(){}
}
