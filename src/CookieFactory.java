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
    // returns appropriate cookie type based on selection
    public Cookie makeCookie(String cookieType) {
        if (cookieType.equals(null)){
            return null;
        }
        else if(cookieType.equals("Sugar -- $2.50")){
            return new Sugar();
        }
        else if(cookieType.equals("Peanut Butter -- $5.50")){
            return new PeanutButter();
        }
        else if(cookieType.equals("Chocolate Chip -- $4.00")){
            return new ChocolateChip();
        }
        else if(cookieType.equals("Oatmeal Raisin -- $4.00")){
            return new OatmealRaisin();
        }
        else if(cookieType.equals("Vanilla -- $4.00")){
            return new vanillaCookie();
        }
        else if(cookieType.equals("Coconut -- $4.50")){
            return new coconutCookie();
        }
        return null;
    }

}