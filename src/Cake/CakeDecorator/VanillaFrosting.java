package Cake.CakeDecorator;

import Cake.Cake;

public class VanillaFrosting extends FrostingDecorator{
    Cake cake;

    public VanillaFrosting(Cake cake){
        this.cake = cake; 
    }

    @Override
    public double cost() {
        return 0.75 + cake.cost();
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", Vanilla Frosting";
    }
}