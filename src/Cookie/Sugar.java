package Cookie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sugar extends withNuts{
    double cost = 2.5;

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Sugar";
    }

    @Override
    public void frosting() {
        System.out.println("make frosting");
    }

    @Override
    public void addSprinkles() {
        System.out.println("Adding sprinkles");
    }

    //hook
    public boolean customerWantsSprinkles(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            cost = cost + 0.5;
            return true;
        }
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like sprinkles? --- 0.5$ (y/n)");

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