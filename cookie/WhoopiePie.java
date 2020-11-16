package cookie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhoopiePie extends FancyCookie {
	public double cost = 5;
	@Override
	public String getDescription() {
		return "Whoopie Pie's have a marshmallow filling!";
	}

	@Override
	public double cost() {
		return cost;
	}

	@Override
	public void customizedIcing() {
		System.out.println("Icing the cookie!");
	}

	@Override
	public void decorate() {	
		System.out.println("Customer wants Sprinkles.");
	}
	public boolean customerWantsDecorated() {
		String answer = getUserInput();

		if(answer.toLowerCase().startsWith("y")){
			cost = cost + .5;
			return true;
		}
		else
			return false;
	}
	private String getUserInput(){
		String answer = null;
		System.out.println("Would you like sprinkles? -> cost + .5$ (y/n)");

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
