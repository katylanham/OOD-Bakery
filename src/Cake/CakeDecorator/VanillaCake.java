package Cake.CakeDecorator;

import Cake.Cake;

public class VanillaCake extends CakeFlavorDecorator {
    Cake cake; 

    public VanillaCake(Cake cake){
        this.cake = cake; 
    }

    @Override
    public double cost() {
        return 1.50 + cake.cost();
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", White Chocolate";
    }
}