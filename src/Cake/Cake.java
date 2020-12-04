// component 

package Cake;

public abstract class Cake {
    String description="";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void prepareBatter(String flavor, javafx.scene.text.Text preparingBatterText) {
        preparingBatterText.setText("Preparing the " + flavor + " batter...");
    }

    public void cookBatter(String flavor, javafx.scene.text.Text cookingBatterText) {
        cookingBatterText.setText("Cooking the " + flavor + " batter...");
    }

    public void frostCake(String frosting, javafx.scene.text.Text frostingCakeText) {
            frostingCakeText.setText("Frosting the cake with " + frosting + "...");
    }

    public void addSprinkles(String sprinkles, javafx.scene.text.Text addingSprinklesText) {
            addingSprinklesText.setText("Adding " + sprinkles + " to your cake...");
    }

    public void dishUp(javafx.scene.text.Text dishUpText) {
        dishUpText.setText("Placing your cake on the dish...");
    }
}
