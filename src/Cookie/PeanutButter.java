package Cookie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PeanutButter extends withNuts{

	double cost = 5.5;

    @Override
    public double cost() {
    	
        return cost;
    }

    @Override
    public String getDescription() {
   
        return "Peanut Butter";
    }

    @Override
    public void frosting() {
    	
        System.out.println("Getting cookie out of display case");
    }

    @Override
    public void addSprinkles() {
    	
        System.out.println("Adding sprinkles to the cookie");
    }

    //hook
    public boolean customerWantsSprinkles(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            cost = cost + 1.5;
            return true;
        }
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you to add sprinkles to your cookie for an uocharge? --- 1.5$ (y/n)");

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
