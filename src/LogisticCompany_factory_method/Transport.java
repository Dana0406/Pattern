package LogisticCompany_factory_method;

public class Transport {
    private String companyName;
    private double maxPayload;
    private double maxSize;

    public Transport(String companyName, double maxPayload, double maxSize) {
        this.companyName = companyName;
        this.maxPayload = maxPayload;
        this.maxSize = maxSize;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getMaxPayload() {
        return maxPayload;
    }

    public double getMaxSize() {
        return maxSize;
    }

    public String getTransportType() {
        return null;
    }
}
