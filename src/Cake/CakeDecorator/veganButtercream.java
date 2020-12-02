package Cake.CakeDecorator;

import Cake.Cake;

public class veganButtercream extends FrostingDecorator {
    Cake cake;

    public veganButtercream(Cake cake){
        this.cake = cake; 
    }

    // add cost of vegan buttercream frosting
    @Override
    public double cost() {
        return 0.85 + cake.cost();
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", with Vegan Buttercream Frosting";
    }
}
