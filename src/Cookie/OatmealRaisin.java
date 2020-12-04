package Cookie;

public class OatmealRaisin extends withoutNuts {
    @Override
    public double cost() {
        return 4.0;
    }

    @Override
    public String getDescription(boolean warm, boolean nuts) {
        if (warm) {
            return "Oatmeal Raisin cookie, warmed";
        }
        return "Oatmeal Raisin cookie";
    }
}
