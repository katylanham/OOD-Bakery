public abstract class Cake {
	// default description of cake 
	String description="";

    public abstract double cost();

    // get the description of the cake 
    public String getDescription(){
        return description;
    }

    // print info to console based on user selection 
    public void prepareBatter(String type) {
        System.out.println("Making "+ type + " batter");
    }

    public void cookBatter(String type) {
        System.out.println("Cooking " + type + " batter");
    }

    public void present(String type) {
        System.out.println("Put " + type + " on the dish");
    }
}
