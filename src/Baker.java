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
import Cake.CakeDecorator.*;


// Receiver
public class Baker {
    public static String cakeType="";
    public static String cookieType="";
    public static String[] cakeFlavorList = null;
    public static String[] frostingList = null;
    public static String[] sprinklesList = null;
    Cake cake;
    Cookie cookie;
    public void getOrder(String factoryType){
        if(factoryType.equalsIgnoreCase("Cake")){
            System.out.println(cakeType + " order received.");

            CakeFactory factory = new CakeFactory(); 
            cake = factory.makeCake(cakeType); 


            cake.prepareDough(cakeType);
            cake.cookDough(cakeType);
            cake.dishUp(cakeType);
            cake = decorate(cakeFlavorList, frostingList, sprinklesList);

            System.out.println(cake.getDescription() + " order completed.");
            System.out.println("Cost: $" + cake.cost());

        }
        else if(factoryType.equalsIgnoreCase("Cookie")){
            System.out.println(cookieType + " order received.");

            CookieFactory factory = new CookieFactory();
            cookie = factory.makeCookie(cookieType);
            cookie.prepareCookie();

            System.out.println(cookie.getDescription() + " order completed.");
            System.out.println("Cost: $" + cookie.cost());
        }
        System.out.println("");
    }

    public Cake decorate(String[] cakeFlavorList, String[] fruitList, String[] sprinklesList){
        for (int i = 0; i < cakeFlavorList.length; i++) {
            String choco = cakeFlavorList[i];
            if(choco.equals("Vanilla Cake")){
            	cake = new VanillaCake(cake); 
            	
              }
            else if(choco.equals("Chocolate Cake")){
            	cake = new ChocolateCake(cake); 
            }
        }

        for (int i = 0; i < frostingList.length; i++) {
            String fruit = frostingList[i];
            if(fruit.equals("Vanilla Frosting")){
            	cake = new VanillaFrosting(cake); 
            }
            else if(fruit.equals("Chocolate Frosting")) {
            	cake = new ChocolateFrosting(cake); 
            }
            else if(fruit.equals("Vegan Buttercream")) {
            	cake = new veganButtercream(cake); 
            }
        }

        for (int i = 0; i < sprinklesList.length; i++) {
            String condiment = sprinklesList[i];
            if(condiment.equals("Coconut Flakes")) {
            	cake = new Coconut(cake); 
  
            }
            else if(condiment.equals("MultiColor Sprinkles")){
            	cake = new MultiColor(cake); 
            }
            else if(condiment.equals("Ice Cream")) {
            	cake = new White(cake); 
            }
        }
        return cake;
    }
}
