package LogisticCompany_factory_method;

public class GermanyLogisticsCompany implements LogisticsCompany {
    @Override
    public Transport createTransport() {
        return new AviationTransport("GermanWings", 80000, 400, "международные", "грузовой");
    }
}
