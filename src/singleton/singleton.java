package singleton;
class �̱���
{
	private static �̱��� instance;
	
	private �̱���() {}
	
	public static �̱��� getInstance()
	{
		if(instance == null)
		{
			
			instance = new �̱���();
		}
		return instance;
	}
}
public class singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		�̱��� s1 = �̱���.getInstance();
		�̱��� s2 = �̱���.getInstance();

		System.out.println(s1);
		System.out.println(s2);
	}

}
