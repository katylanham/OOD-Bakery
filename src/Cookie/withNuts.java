package Cookie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class withNuts implements Cookie {
    public abstract double cost();
    public abstract String getDescription(boolean warmed, boolean nuts);

    //template method
    @Override
    public void prepareCookie(javafx.scene.text.Text removingCookieFromDisplayText, javafx.scene.text.Text addingNutsText,
                              javafx.scene.text.Text warmingCookieText, javafx.scene.text.Text baggingCookieText, boolean warmedCookie, boolean addNuts) {
    	removeFromDisplay(removingCookieFromDisplayText);

        if(addNuts) {
            addNuts(addingNutsText);
        }
        if (warmedCookie) {
            warm(warmingCookieText);
        }
        bag(baggingCookieText);
    }

    public void removeFromDisplay(javafx.scene.text.Text removingCookieFromDisplayText) { removingCookieFromDisplayText.setText("Removing the cookie from the display case..."); }

    public void warm(javafx.scene.text.Text warmingCookieText) { warmingCookieText.setText("Warming up your cookie..."); }

    public void bag(javafx.scene.text.Text baggingCookieText){
        baggingCookieText.setText("Putting it in the bag...");
    }

    public abstract void addNuts(javafx.scene.text.Text addingNutsText);

    boolean customerWantsNuts(){
        return true;
    }

  
    public boolean customerWantsWarmed(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("yes")){
            return true;
        }
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like your cookie warmed up? (yes/no)");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(answer == null){
            answer = "no";
        }

        return answer;
    }
}
