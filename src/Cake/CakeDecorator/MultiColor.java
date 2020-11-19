package Cake.CakeDecorator;


import Cake.Cake;

public class MultiColor extends SprinklesDecorator{
    Cake cake;

    public MultiColor(Cake cake){
        this.cake = cake; 
    }

    @Override
    public double cost() {
        return 0.10 + cake.cost();
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", Multicolor Sprinkles";
    }
}
