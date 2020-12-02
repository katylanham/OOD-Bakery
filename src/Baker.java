import Cake.Cake;
import Cake.CakeDecorator.Coconut;
import Cake.CakeDecorator.VanillaFrosting;
import Cake.CakeDecorator.MultiColor;
import Cake.CakeDecorator.White;
import Cake.CakeDecorator.veganButtercream;
import Cake.CakeDecorator.ChocolateCake;
import Cake.CakeDecorator.ChocolateFrosting;
import Cake.CakeDecorator.VanillaCake;
import Cookie.Cookie;


// receiver end
public class Baker {
    public static String cakeType="";
    public static String cookieType="";
    public static String[] cakeFlavorList = {"Vanilla", "Chocolate"};
    public static String[] frostingList = {"Vanilla", "Chocolate", "Vegan Buttercream"};
    public static String[] sprinklesList = {"Coconut Flakes", "Multicolor", "White"};
    String cakeFlavor;
    String sprinkles;
    String frosting;

    Cake cake;
    Cookie cookie;
    public void getOrder(String factoryType){
        if(factoryType.equalsIgnoreCase("Cake")){
            System.out.println(cakeType + " order received.");

            CakeFactory factory = new CakeFactory(); 
            cake = factory.makeCake(cakeType); 



            cake = decorate(cakeFlavorList, frostingList, sprinklesList);
            cake.prepareBatter(cakeFlavor);
            cake.cookBatter(cakeFlavor);
            cake.frostCake(frosting);
            cake.addSprinkles(sprinkles);
            cake.dishUp();


            System.out.println("Order Completed: " + cake.getDescription() + ".");
            System.out.printf("Cost: $%.2f\n", cake.cost());

        }
        else if(factoryType.equalsIgnoreCase("Cookie")){
            System.out.println(cookieType + " order received.");

            CookieFactory factory = new CookieFactory();
            cookie = factory.makeCookie(cookieType);
            cookie.prepareCookie();

            System.out.println(cookie.getDescription() + " order completed.");
            System.out.printf("Cost: $%.2f\n", cookie.cost());
        }
        System.out.println("");
    }

    public Cake decorate(String[] cakeFlavorList, String[] frostingList, String[] sprinklesList){
        for (int i = 0; i < cakeFlavorList.length; i++) {
            cakeFlavor = cakeFlavorList[i];
            if(cakeFlavor.equals("Vanilla")){
            	cake = new VanillaCake(cake);
              }
            else if(cakeFlavor.equals("Chocolate")){
            	cake = new ChocolateCake(cake); 
            }
        }

        for (int i = 0; i < frostingList.length; i++) {
            frosting = frostingList[i];
            if(frosting.equals("Vanilla Frosting")){
            	cake = new VanillaFrosting(cake);
            }
            else if(frosting.equals("Chocolate Frosting")) {
            	cake = new ChocolateFrosting(cake);
            }
            else if(frosting.equals("Vegan Buttercream Frosting")) {
            	cake = new veganButtercream(cake);
            }
        }

        for (int i = 0; i < sprinklesList.length; i++) {
            sprinkles = sprinklesList[i];
            if(sprinkles.equals("Coconut Flakes")) {
            	cake = new Coconut(cake);
            }
            else if(sprinkles.equals("Multicolor Sprinkles")){
            	cake = new MultiColor(cake);
            }
            else if(sprinkles.equals("White Sprinkles")) {
            	cake = new White(cake);
            }
        }
        return cake;
    }
}
