public class CakeOrder implements Command {
	Baker baker;
	String[] cakeFlavorList, frostingList, sprinklesList;
	String order;

	public CakeOrder(Baker baker, String order, String[] cakeFlavorList, String[] frostingList,
			String[] sprinklesList) {
		this.baker = baker;
		this.order = order;
		this.cakeFlavorList = cakeFlavorList;
		this.frostingList = frostingList;
		this.sprinklesList = sprinklesList;
	}

	@Override
	public void order() {
		Baker.cakeType = order;
		Baker.cakeFlavorList = this.cakeFlavorList;
		Baker.frostingList = this.frostingList;
		Baker.sprinklesList = this.sprinklesList;
		baker.getOrder("Cake");
	}
}