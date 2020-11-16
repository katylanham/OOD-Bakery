package cookie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class RegularCookie implements Cookie {

	public abstract String getDescription();

	public abstract double cost();
	//template
	public void prepareCookie() {
		removeFromCase();
		putOnPlater();
		if(customerWantsHeated()) {
			heatCookie();
		}
		serveCookie();
	}
	public void removeFromCase(){
		System.out.println("Cookie removed from display case.");
	}
	public void putOnPlater() {
		System.out.println("Place cookie on serving plate.");
	}
	public void heatCookie() {
		System.out.println("Heating cookie in microwave.");
	}
	public boolean customerWantsHeated() {
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		}
		else {
			return false;
		}
	}
	private String getUserInput() {
		String answer = null;
		System.out.println("Would you like ice?");
		BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = r1.readLine();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		if (answer==null) {
			answer = "no";
		}
		return answer;
	}
	public void serveCookie() {
		System.out.println("Handing cookie to customer.");
	}
}
