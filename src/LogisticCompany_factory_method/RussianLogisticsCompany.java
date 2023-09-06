package LogisticCompany_factory_method;

public class RussianLogisticsCompany implements LogisticsCompany {
    @Override
    public Transport createTransport() {
        return new RailwayTransport("RussianRail", 50000, 200, 1520, true);
    }
}

