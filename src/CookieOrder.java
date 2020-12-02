
public class CookieOrder implements Command{
    Baker baker;
    String order;
    public CookieOrder(Baker baker, String order){
        this.baker = baker; 
        this.order = order;
    }

    @Override
    public void order() {
        baker.cookieType = order;
        baker.getOrder("Cookie");
    }
}
