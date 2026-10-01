public class Veterinarian extends ServiceProvider{

    private String clinicName ;
    private double consultationFee;

    public Veterinarian(int personId, String name, long mobileNo, String email, String providerType, double experience, String specialization, String clinicName, double consultationFee) {
        super(personId, name, mobileNo, email, providerType, experience, specialization);
        this.clinicName = clinicName;
        this.consultationFee = consultationFee;
    }


    @Override
    public void displayInfo(){}

    public void provideService(){}


}
