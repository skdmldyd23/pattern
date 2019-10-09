package decorator;

public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Beverage b1 = new main_Americano();
		Beverage b2 = new main_iceTea();
		
		System.out.println(b1.getName());
		System.out.println(b1.totalcost());
		
		b1 = new sub_whip(b1);
		System.out.println(b1.getName());
		System.out.println(b1.totalcost());
		
		b1 = new sub_whip(b1);
		System.out.println(b1.getName());
		System.out.println(b1.totalcost());


		System.out.println(b2.getName());
		System.out.println(b2.totalcost());
		
		b2 = new shot(b2);
		System.out.println(b2.getName());
		System.out.println(b2.totalcost());
	}	
}