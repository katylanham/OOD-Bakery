// may need to be added later      import Cake.Cake;
public class Vanilla {
	Cake cake;

	    public Vanilla(Cake cake){
	        this.cake = cake;
	    }

	    public double cost() {
	        return 0.35 + cake.cost();
	    }

	    public String getDescription() {
	        return cake.getDescription() + ", Vanilla";
	    }
}