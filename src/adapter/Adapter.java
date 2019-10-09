package adapter;

public class Adapter implements SamsungModule {
	private Douzon d;
	
	public Adapter(Douzon d) {
		this.d = d;
	}
	
	@Override
	public void 삼성기능1() {
		d.더존더존();
		// 추가작업
	}

	@Override
	public void 삼성기능2() {
		// 구현
	}
}
