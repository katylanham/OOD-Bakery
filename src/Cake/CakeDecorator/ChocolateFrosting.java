package Cake.CakeDecorator;

import Cake.Cake;

public class ChocolateFrosting extends FrostingDecorator {
    Cake cake; 

    public ChocolateFrosting(Cake cake){
        this.cake = cake; 
    }

    @Override
    public double cost() {
        return 0.65 + cake.cost();
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", with Chocolate Frosting";
    }
}
