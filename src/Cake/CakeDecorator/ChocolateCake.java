package Cake.CakeDecorator;

import Cake.Cake;

public class ChocolateCake extends CakeFlavorDecorator{
    Cake cake; 

    public ChocolateCake(Cake cake){
        this.cake = cake; 
    }

    @Override
    public double cost() {
        return 1.25 + cake.cost();
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", Chocolate flavored";
    }
}
