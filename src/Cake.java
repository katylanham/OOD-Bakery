
public abstract class Cake {
	String description="";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void prepareBatter(String type) {
        System.out.println("making "+ type + " batter");
    }

    public void cookBatter(String type) {
        System.out.println("Cooking " + type + " batter");
    }

    public void present(String type) {
        System.out.println("Put " + type + " on the dish");
    }
}
