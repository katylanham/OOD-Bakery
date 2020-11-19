package Cookie;

public abstract class withNuts implements Cookie {
    public abstract double cost();
    public abstract String getDescription();

    //template method
    @Override
    public void prepareCookie() {
    	getCakeOutOfOven();
        frosting();
        bag();

        if(customerWantsSprinkles()) {
            addSprinkles();
        }
    }

    public void getCakeOutOfOven(){
        System.out.println("Getting the cookie out of the oven");
    }

    public abstract void frosting();

    public void bag(){
        System.out.println("putting in bag");
    }

    public abstract void addSprinkles();

    boolean customerWantsSprinkles(){
        return true;
    }
}
