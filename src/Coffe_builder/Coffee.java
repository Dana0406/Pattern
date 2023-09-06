package Coffe_builder;

public class Coffee {
    private boolean isDoubleCoffee;
    private boolean hasCream;
    private boolean hasMilk;
    private boolean hasSugar;
    private boolean hasCinnamon;
    private boolean hasSyrup;

    public Coffee(boolean isDoubleCoffee, boolean hasCream, boolean hasMilk, boolean hasSugar, boolean hasCinnamon, boolean hasSyrup) {
        this.isDoubleCoffee = isDoubleCoffee;
        this.hasCream = hasCream;
        this.hasMilk = hasMilk;
        this.hasSugar = hasSugar;
        this.hasCinnamon = hasCinnamon;
        this.hasSyrup = hasSyrup;
    }

    public boolean isDoubleCoffee() {
        return isDoubleCoffee;
    }

    public void setDoubleCoffee(boolean doubleCoffee) {
        isDoubleCoffee = doubleCoffee;
    }

    public boolean isHasCream() {
        return hasCream;
    }

    public void setHasCream(boolean hasCream) {
        this.hasCream = hasCream;
    }

    public boolean isHasMilk() {
        return hasMilk;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    public boolean isHasSugar() {
        return hasSugar;
    }

    public void setHasSugar(boolean hasSugar) {
        this.hasSugar = hasSugar;
    }

    public boolean isHasCinnamon() {
        return hasCinnamon;
    }

    public void setHasCinnamon(boolean hasCinnamon) {
        this.hasCinnamon = hasCinnamon;
    }

    public boolean isHasSyrup() {
        return hasSyrup;
    }

    public void setHasSyrup(boolean hasSyrup) {
        this.hasSyrup = hasSyrup;
    }
}
