package adapter;

public class Adapter implements SamsungModule {
	private Douzon d;
	
	public Adapter(Douzon d) {
		this.d = d;
	}
	
	@Override
	public void �Ｚ���1() {
		d.��������();
		// �߰��۾�
	}

	@Override
	public void �Ｚ���2() {
		// ����
	}
}
