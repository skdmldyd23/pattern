package ObserverTest;

public class User1 implements Root {

	private Boss b;
	
//	public User1(Boss b) {
//	// TODO Auto-generated constructor stub
//		this.b = b;
//		b.add(this);
//		System.out.println("User 1 - add �Ϸ�");
//	}
	@Override
	public void inForm() {
		// TODO Auto-generated method stub
		System.out.println("User 1���� �˸�");
	}

}
