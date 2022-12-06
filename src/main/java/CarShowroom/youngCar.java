package CarShowroom;

import java.util.Comparator;

public class youngCar implements Comparator<Cars> {
	@Override
	public int compare(Cars o1, Cars o2) {
		int youngCar = Integer.compare(o2.getAge(), o1.getAge());
		return youngCar;
	}
}
