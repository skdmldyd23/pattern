package ObserverTest;

public class User3 implements Root {
private Boss b;
	
//	public User3(Boss b) {
//	// TODO Auto-generated constructor stub
//		this.b = b;
//		b.add(this);
//		System.out.println("User3 - add 완료");
//	}
	@Override
	public void inForm() {
		// TODO Auto-generated method stub
		System.out.println("User 3에게 알림");
	}

}
