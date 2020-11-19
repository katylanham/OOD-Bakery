//may need to be added later    import Cake.Cake;
public class Chocolate {
Cake cake;

public Chocolate(Cake cake){
this.cake = cake;
		    }

public double cost() {
	return 0.35 + cake.cost();
		    }

public String getDescription() {
		        return cake.getDescription() + ", Chocolate";
		    }
}