package Cookie;

public interface Cookie {
    public String getDescription(boolean warmed, boolean nuts);
    public double cost();
    public void prepareCookie(javafx.scene.text.Text removingCookieFromDisplayText, javafx.scene.text.Text addingNutsText,
                              javafx.scene.text.Text warmingCookieText, javafx.scene.text.Text baggingCookieText, boolean cookieWarmed,
                              boolean cookieAddNuts);
}
