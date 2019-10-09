package ObserverTest;

public class User4 implements Root {
	public User4(Boss boss)  {
        boss.add(this);
        boss.bb(this);
	}

	public void inForm() {
		// TODO Auto-generated method stub
		System.out.println("User 4에게 알림");		
	}

}
