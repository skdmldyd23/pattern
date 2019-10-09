package decorator;

public class shot extends Beverage {

	private Beverage beverage;
	
	public shot(Beverage b) {
		this.beverage = b;
	}
	
	public String getName() {
		return beverage.getName()+ " + " + "¼¦";
	}
	@Override
	public int totalcost() {
		// TODO Auto-generated method stub
		return beverage.totalcost() + 500;
	}
	
}
