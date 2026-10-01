public class Service {
    private int serviceId;
    private String serviceName;
    private String serviceDescription;
    private double servicePrice;
    private boolean serviceAvailable;

    public Service(int serviceId, String serviceName, String serviceDescription, double servicePrice) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;
        this.servicePrice = servicePrice;
        this.serviceAvailable = true;
    }

    public void displayServiceInfo(){}

    public void updatePrice(){}

    public void enableService(){}

    public void disableService(){}
}
