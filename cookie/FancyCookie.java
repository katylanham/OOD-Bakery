package cookie;

public abstract class FancyCookie implements Cookie {

	public abstract String getDescription();

	public abstract double cost();
	//template method
	public void prepareCookie() {
		removeFromCase();
		customizedIcing();
		putOnPlate();
		
		if(customerWantsDecorated()) {
			decorate();
		}
		serveCookie();
	}
	public void removeFromCase() {
		System.out.println("Cookie removed from display case.");
	}
	public abstract void customizedIcing();
	public void putOnPlate() {
		System.out.println("Plating cookie.");
	}
	public abstract void decorate();
	boolean customerWantsDecorated() {
		return true;
	}
	public void serveCookie() {
		System.out.println("Handing cookie to customer.");
	}
}
