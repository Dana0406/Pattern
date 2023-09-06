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

        System.out.println("Кофе: " + (coffee.isDoubleCoffee() ? "Двойной" : "Обычный"));
        System.out.println("Сливки: " + (coffee.isHasCream() ? "Да" : "Нет"));
        System.out.println("Молоко: " + (coffee.isHasMilk() ? "Да" : "Нет"));
        System.out.println("Сахар: " + (coffee.isHasSugar() ? "Да" : "Нет"));
        System.out.println("Корица: " + (coffee.isHasCinnamon() ? "Да" : "Нет"));
        System.out.println("Сироп: " + (coffee.isHasSyrup() ? "Да" : "Нет") + "\n\n");

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

        System.out.println("Российская компания: " + russianTransport.getTransportType());
        System.out.println("США компания: " + usTransport.getTransportType());
        System.out.println("Белорусская компания: " + belarusTransport.getTransportType());
        System.out.println("Немецкая компания: " + germanyTransport.getTransportType());


        System.out.println("\n\n");

        UserManagerFacade userManager = new UserManagerFacade();

        User user1 = userManager.getUserData("1");
        User user2 = userManager.getUserData("2");

        User user1Cached = userManager.getUserData("1");
        
        if (user1 != null) {
            System.out.println("Пользователь 1: " + user1.getName());
        } else {
            System.out.println("Пользователь 1 не найден.");
        }

        if (user2 != null) {
            System.out.println("Пользователь 2: " + user2.getName());
        } else {
            System.out.println("Пользователь 2 не найден.");
        }

        if (user1Cached != null) {
            System.out.println("Пользователь 1 (из кеша): " + user1Cached.getName());
        } else {
            System.out.println("Пользователь 1 (из кеша) не найден.");
        }
    }
}

