package Cake.CakeDecorator;

import Cake.Cake;

public class White extends SprinklesDecorator {
    Cake cake;

    public White(Cake cake){
        this.cake = cake; 
    }

    @Override
    public double cost() {
        return 2.50 + cake.cost();
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", and White Sprinkles";
    }
}