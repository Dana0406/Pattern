package Coffe_builder;

public class MyCoffeeBuilder implements CoffeeBuilder {
    private boolean isDoubleCoffee;
    private boolean hasCream;
    private boolean hasMilk;
    private boolean hasSugar;
    private boolean hasCinnamon;
    private boolean hasSyrup;

    @Override
    public CoffeeBuilder addDoubleCoffee() {
        isDoubleCoffee = true;
        return this;
    }

    @Override
    public CoffeeBuilder addCream() {
        hasCream = true;
        return this;
    }

    @Override
    public CoffeeBuilder addMilk() {
        hasMilk = true;
        return this;
    }

    @Override
    public CoffeeBuilder addSugar() {
        hasSugar = true;
        return this;
    }

    @Override
    public CoffeeBuilder addCinnamon() {
        hasCinnamon = true;
        return this;
    }

    @Override
    public CoffeeBuilder addSyrup() {
        hasSyrup = true;
        return this;
    }

    @Override
    public Coffee build() {
        return new Coffee(isDoubleCoffee, hasCream, hasMilk, hasSugar, hasCinnamon, hasSyrup);
    }
}
