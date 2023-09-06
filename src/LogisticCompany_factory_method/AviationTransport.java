package LogisticCompany_factory_method;

public class AviationTransport extends Transport {
    private String aviationType;
    private String transportType;

    public AviationTransport(String companyName, double maxPayload, double maxSize, String aviationType, String transportType) {
        super(companyName, maxPayload, maxSize);
        this.aviationType = aviationType;
        this.transportType = transportType;
    }

    @Override
    public String getTransportType() {
        return "Авиатранспорт (" + aviationType + ", " + transportType + ")";
    }
}
