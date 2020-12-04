package Cookie;

public class coconutCookie extends withoutNuts {
    @Override
    public double cost() {
        return 4.5;
    }

    @Override
    public String getDescription(boolean warm, boolean nuts) {
        if (warm) {
            return "Coconut Cookie, warmed";
        }
        return "Coconut Cookie";
    }
}
