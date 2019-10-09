package singleton;
class ΩÃ±€≈Ê
{
	private static ΩÃ±€≈Ê instance;
	
	private ΩÃ±€≈Ê() {}
	
	public static ΩÃ±€≈Ê getInstance()
	{
		if(instance == null)
		{
			
			instance = new ΩÃ±€≈Ê();
		}
		return instance;
	}
}
public class singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ΩÃ±€≈Ê s1 = ΩÃ±€≈Ê.getInstance();
		ΩÃ±€≈Ê s2 = ΩÃ±€≈Ê.getInstance();

		System.out.println(s1);
		System.out.println(s2);
	}

}
