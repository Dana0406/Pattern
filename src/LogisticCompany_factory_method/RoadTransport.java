package LogisticCompany_factory_method;

public class RoadTransport extends Transport {
    public RoadTransport(String companyName, double maxPayload, double maxSize) {
        super(companyName, maxPayload, maxSize);
    }

    @Override
    public String getTransportType() {
        return "Автотранспорт";
    }
}
