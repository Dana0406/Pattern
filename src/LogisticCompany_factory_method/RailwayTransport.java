package LogisticCompany_factory_method;

public class RailwayTransport extends Transport {
    private double trackSize;
    private boolean hasBallast;

    public RailwayTransport(String companyName, double maxPayload, double maxSize, double trackSize, boolean hasBallast) {
        super(companyName, maxPayload, maxSize);
        this.trackSize = trackSize;
        this.hasBallast = hasBallast;
    }

    @Override
    public String getTransportType() {
        return "Железнодорожный транспорт";
    }
}
