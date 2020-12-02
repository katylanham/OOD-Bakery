package Cookie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class withoutNuts implements Cookie{
    public abstract double cost();
    public abstract String getDescription();

    //template method
    @Override
    public void prepareCookie() {
        removeFromDisplay();
        if(customerWantsWarmed()) {
            warm();
        }
        bag();
    }

    public void removeFromDisplay() { System.out.println("Removing the cookie from the display case..."); }

    public void warm() { System.out.println("Warming up your cookie..."); }

    public void bag(){
        System.out.println("Putting it in the bag...");
    }

    //hook
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
