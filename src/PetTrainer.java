public class PetTrainer extends ServiceProvider{

    private String trainingType;
    private double trainingFee;

    public PetTrainer(int personId, String name, long mobileNo, String email, String providerType, double experience, String specialization, String trainingType, double trainingFee) {
        super(personId, name, mobileNo, email, providerType, experience, specialization);
        this.trainingType = trainingType;
        this.trainingFee = trainingFee;
    }

    @Override
    public void displayInfo(){}

    public void provideService(){}

}
