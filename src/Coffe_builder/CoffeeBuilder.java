package Coffe_builder;

public interface CoffeeBuilder {
    CoffeeBuilder addDoubleCoffee();
    CoffeeBuilder addCream();
    CoffeeBuilder addMilk();
    CoffeeBuilder addSugar();
    CoffeeBuilder addCinnamon();
    CoffeeBuilder addSyrup();
    Coffee build();
}
