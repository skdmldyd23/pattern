package ObserverTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boss b = new Boss();
		
		User1 u1 = new User1();
		User2 u2 = new User2();
		User3 u3 = new User3();
		User4 u4 = new User4(b);
		
		b.add(u1);
		b.add(u2);
		b.add(u3);
		
		b.RingRing();
		System.out.println("------------");
		b.bb(u4);
		
		u4.inForm();
	}

}
