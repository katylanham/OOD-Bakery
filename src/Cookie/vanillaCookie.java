package Cookie;

public class vanillaCookie extends withoutNuts{
    @Override
    public double cost() {
        return 4.0;
    }

    @Override
    public String getDescription(boolean warm, boolean nuts) {
        if (warm) {
            return "Vanilla Cookie, warmed";
        }
        return "Vanilla Cookie";
    }
}
