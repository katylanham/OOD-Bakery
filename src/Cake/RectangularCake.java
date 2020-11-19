package Cake;

public class RectangularCake extends Cake {
    public RectangularCake() {
        description = "Rectangular Cake";
    }

    @Override
    public double cost() {
        return 5.00;
    }
}
