package Cake.CakeDecorator;

import Cake.Cake;

public class Coconut extends SprinklesDecorator {
    Cake cake;

    public Coconut(Cake cake){
        this.cake = cake; 
    }

    @Override
    public double cost() {
        return 3.35 + cake.cost();
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", and Coconut Flakes";
    }
}