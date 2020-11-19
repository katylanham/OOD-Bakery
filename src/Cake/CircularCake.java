//Concrete Component

package Cake;

public class CircularCake extends Cake{
    public  CircularCake(){
       description =  "Circular Cake";
    }

    @Override
    public double cost() {
        return 4.00;
    }
}
