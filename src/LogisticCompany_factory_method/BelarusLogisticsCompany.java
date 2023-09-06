package LogisticCompany_factory_method;

public class BelarusLogisticsCompany implements LogisticsCompany {
    @Override
    public Transport createTransport() {
        return new RoadTransport("BelarusAuto", 20000, 300);
    }
}
