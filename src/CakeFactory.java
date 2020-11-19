import Cake.CircularCake; 
import Cake.RectangularCake; 
import Cake.Cake; 
import Cake.*;

public class CakeFactory {

    public Cake makeCake(String cakeType) {
        if (cakeType.equals(null)){
            return null;
        }
        else if(cakeType.equals("Rectangular Cake")){
            return new RectangularCake();
        }
        else if(cakeType.equals("Circular Cake")){
            return new CircularCake();
        }
        return null;
    }

}
