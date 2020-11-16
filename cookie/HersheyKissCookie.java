package cookie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HersheyKissCookie extends FancyCookie{
	double cost = 4.5;
	@Override
	public String getDescription() {
		return "Hershey Kiss Cookies have a hershey kiss sitting on top!";
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
		System.out.println("Adding chocolate drizzle.");
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
		System.out.println("Would you like chocolate drizzle? -> cost + .5$ (y/n)");

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
