// component 

package Cake;

public abstract class Cake {
    String description="";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void prepareBatter(String flavor) {
        System.out.println("Preparing the " + flavor + " batter...");
    }

    public void cookBatter(String flavor) {
        System.out.println("Cooking the " + flavor + " batter...");
    }

    public void frostCake(String frosting) {
            System.out.println("Frosting the cake with " + frosting + "...");
    }

    public void addSprinkles(String sprinkles) {
            System.out.println("Adding " + sprinkles + " to your cake...");
    }

    public void dishUp() {
        System.out.println("Placing your cake on the dish...");
    }
}
