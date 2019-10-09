package ObserverTest;

import java.util.ArrayList;

public class Boss implements Emergence{
	private int i = 1;
	private ArrayList<Root> observers;
	
	public Boss() {
		observers = new ArrayList<Root>();
	}
	
	@Override
	public void add(Root observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void del(Root observer) {
		// TODO Auto-generated method stub
		int index = observers.indexOf(observer);
        observers.remove(index);
	}

	@Override
	public void RingRing() {
		// TODO Auto-generated method stub
		for (Root r : observers) {
			r.inForm();
			System.out.println("³¢¾ß " + i);
			i++;
		}
	}

	@Override
	public void bb(Root observer) {
		// TODO Auto-generated method stub
		observer.inForm();
	}
}
