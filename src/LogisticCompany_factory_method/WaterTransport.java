package LogisticCompany_factory_method;

public class WaterTransport extends Transport {
    private String waterType;

    public WaterTransport(String companyName, double maxPayload, double maxSize, String waterType) {
        super(companyName, maxPayload, maxSize);
        this.waterType = waterType;
    }

    @Override
    public String getTransportType() {
        return "Водный транспорт (" + waterType + ")";
    }
}
