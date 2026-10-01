import java.util.ArrayList;

public class ServiceProvider extends Person{
    private String providerType;
    private double experience;
    private String specialization;
    private boolean available;
    private ArrayList assignedBookings ; // empty list of bookings

    // Constructor with Parameterized super()
    public ServiceProvider(int personId, String name, long mobileNo, String email, String providerType, double experience, String specialization) {
        super(personId, name, mobileNo, email);
        this.providerType = providerType;
        this.experience = experience;
        this.specialization = specialization;
        this.available = true;
        this.assignedBookings = new ArrayList<>();
    }

    public void acceptBooking(){}

    public void rejectBooking(){}

    public void startService(){}

    public void completeService(){}

    public void viewAssignedBookings(){}

    public void displayInfo(){}

    //Getters

    public String getProviderType() {
        return providerType;
    }

    public double getExperience() {
        return experience;
    }

    public String getSpecialization() {
        return specialization;
    }


}
