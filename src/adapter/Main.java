package adapter;

public class Main {
	public static void main(String[] args) {
		Adapter a = new Adapter(new Douzon());
		Samsung s = new Samsung(a);
	}
}
