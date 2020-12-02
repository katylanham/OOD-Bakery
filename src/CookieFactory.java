import Cookie.*;
import Cookie.Sugar;
import Cookie.PeanutButter;
import Cookie.ChocolateChip;
import Cookie.Cookie;
import Cookie.OatmealRaisin;
import Cookie.coconutCookie;
import Cookie.vanillaCookie;
import Cookie.Sugar;

public class CookieFactory {
// cookie types
    public Cookie makeCookie(String cookieType) {
        if (cookieType.equals(null)){
            return null;
        }
        else if(cookieType.equals("Sugar")){
            return new Sugar();
        }
        else if(cookieType.equals("Peanut Butter")){
            return new PeanutButter();
        }
        else if(cookieType.equals("Chocolate Chip")){
            return new ChocolateChip();
        }
        else if(cookieType.equals("Oatmeal Raisin")){
            return new OatmealRaisin();
        }
        else if(cookieType.equals("Vanilla")){
            return new vanillaCookie();
        }
        else if(cookieType.equals("Coconut Cookie")){
            return new coconutCookie();
        }
        return null;
    }

}