package ObserverTest;

public class User2 implements Root {
//private Boss b;
//	
//	public User2(Boss b) {
//	// TODO Auto-generated constructor stub
//		this.b = b;
//		b.add(this);
//		System.out.println("User 2 - add 완료");
//	}
	@Override
	public void inForm() {
		// TODO Auto-generated method stub
		System.out.println("User 2에게 알림");
	}
}
