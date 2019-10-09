package decorator;

public class sub_whip extends Beverage {

	private Beverage beverage;
	
	public sub_whip(Beverage b) {
		this.beverage = b;
	}
	
	public String getName() {
		return beverage.getName()+ " + " + "ÈÖÇÎ";
	}
	@Override
	public int totalcost() {
		// TODO Auto-generated method stub
		return beverage.totalcost() + 200;
	}
	
}
