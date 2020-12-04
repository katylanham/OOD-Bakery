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
    public String getDescription(boolean warmed, boolean nuts) {
        if (warmed) {
            if (nuts) {
                return "Peanut Butter cookie, warmed, with nuts";
            } else {
                return "Peanut Butter cookie, warmed";
            }
        } else {
            if (nuts) {
                return "Peanut Butter cookie, with nuts";
            }
        }
        return "Peanut Butter cookie";
    }

    @Override
    public void addNuts(javafx.scene.text.Text addNutsText) {
        cost = cost + 0.5;
        addNutsText.setText("Adding nuts...");
    }

    //hook
    public boolean customerWantsNuts(){
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
        System.out.println("Would you like nuts? --- $0.50 (y/n)");

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
