import Cake.*;
import Cake.CircularCake;
import Cake.RectangularCake;
import Cake.Cake;

public class CakeFactory {

	public Cake makeCake(String cakeType) {
		if (cakeType.equals(null)) {
			return null;
		}
		// if needed, return rectangular cake
		else if (cakeType.equals("Rectangular Cake")) {
			return new RectangularCake();
		}
		// if needed, return circular cake
		else if (cakeType.equals("Circular Cake")) {
			return new CircularCake();
		}
		return null;
	}

}
