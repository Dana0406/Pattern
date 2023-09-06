import Coffe_builder.Coffee;
import Coffe_builder.CoffeeBuilder;
import Coffe_builder.MyCoffeeBuilder;
import LogisticCompany_factory_method.*;
import logic_facade.User;
import logic_facade.UserManagerFacade;

public class Main {
    public static void main(String[] args) {
        CoffeeBuilder builder = new MyCoffeeBuilder();
        Coffee coffee = builder
                .addDoubleCoffee()
                .addCream()
                .addSugar()
                .build();

        System.out.println("����: " + (coffee.isDoubleCoffee() ? "�������" : "�������"));
        System.out.println("������: " + (coffee.isHasCream() ? "��" : "���"));
        System.out.println("������: " + (coffee.isHasMilk() ? "��" : "���"));
        System.out.println("�����: " + (coffee.isHasSugar() ? "��" : "���"));
        System.out.println("������: " + (coffee.isHasCinnamon() ? "��" : "���"));
        System.out.println("�����: " + (coffee.isHasSyrup() ? "��" : "���") + "\n\n");

        Sun sun1 = Sun.getInstance();
        Sun sun2 = Sun.getInstance();

        System.out.println(sun1 == sun2);

        sun1.sunrise();
        sun2.sunset();

        System.out.println("\n");

        LogisticsCompany russianCompany = new RussianLogisticsCompany();
        LogisticsCompany usCompany = new USALogisticsCompany();
        LogisticsCompany belarusCompany = new BelarusLogisticsCompany();
        LogisticsCompany germanyCompany = new GermanyLogisticsCompany();

        Transport russianTransport = russianCompany.createTransport();
        Transport usTransport = usCompany.createTransport();
        Transport belarusTransport = belarusCompany.createTransport();
        Transport germanyTransport = germanyCompany.createTransport();

        System.out.println("���������� ��������: " + russianTransport.getTransportType());
        System.out.println("��� ��������: " + usTransport.getTransportType());
        System.out.println("����������� ��������: " + belarusTransport.getTransportType());
        System.out.println("�������� ��������: " + germanyTransport.getTransportType());


        System.out.println("\n\n");

        UserManagerFacade userManager = new UserManagerFacade();

        User user1 = userManager.getUserData("1");
        User user2 = userManager.getUserData("2");

        User user1Cached = userManager.getUserData("1");
        
        if (user1 != null) {
            System.out.println("������������ 1: " + user1.getName());
        } else {
            System.out.println("������������ 1 �� ������.");
        }

        if (user2 != null) {
            System.out.println("������������ 2: " + user2.getName());
        } else {
            System.out.println("������������ 2 �� ������.");
        }

        if (user1Cached != null) {
            System.out.println("������������ 1 (�� ����): " + user1Cached.getName());
        } else {
            System.out.println("������������ 1 (�� ����) �� ������.");
        }
    }
}

