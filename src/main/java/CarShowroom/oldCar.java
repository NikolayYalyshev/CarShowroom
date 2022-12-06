package CarShowroom;

import java.util.Comparator;

public class oldCar implements Comparator<Cars> {
	@Override
	public int compare(Cars o1, Cars o2) {
		int oldCar = Integer.compare(o1.getAge(), o2.getAge());
		return oldCar;
	}
}
