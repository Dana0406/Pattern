package LogisticCompany_factory_method;

public class USALogisticsCompany implements LogisticsCompany {
    @Override
    public Transport createTransport() {
        return new WaterTransport("USWaterways", 100000, 500, "морской");
    }
}
