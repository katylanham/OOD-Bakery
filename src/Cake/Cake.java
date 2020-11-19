// Component

package Cake;

public abstract class Cake {
    String description="";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void prepareDough() {
        System.out.println("Preparing the dough...");
    }

    public void cookDough() {
        System.out.println("Cooking the dough...");
    }

    public void frostCake(String frosting) {
            System.out.println("Frosting the cake with " + frosting + "frosting.");
    }

    public void addSprinkles(String sprinkles) {
            System.out.println("Adding " + sprinkles + " to your cake.");
    }

    public void dishUp() {
        System.out.println("Placing your cake on the dish...");
    }
}
