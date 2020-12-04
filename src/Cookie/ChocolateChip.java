package Cookie;

public class ChocolateChip extends withoutNuts{
    @Override
    public double cost() {
        return 4.0;
    }

    @Override
    public String getDescription(boolean warm, boolean nuts) {
        if (warm) {
            return "Chocolate Chip cookie, warmed";
        }
        return "Chocolate Chip cookie";
    }
}
