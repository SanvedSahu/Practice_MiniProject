public class PetGroomer extends ServiceProvider{

    private String groomingType;
    private double groomingFee;

    public PetGroomer(int personId, String name, long mobileNo, String email, String providerType, double experience, String specialization, String groomingType, double groomingFee) {
        super(personId, name, mobileNo, email, providerType, experience, specialization);
        this.groomingType = groomingType;
        this.groomingFee = groomingFee;
    }

    @Override
    public void displayInfo(){}

    public void provideService(){}
}
