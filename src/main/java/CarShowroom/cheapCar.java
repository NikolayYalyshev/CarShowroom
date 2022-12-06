package CarShowroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class cheapCar implements Comparator<Cars> {
	
	@Override
	public int compare(Cars o1, Cars o2) {
		int cheapCar = Integer.compare(o1.getPrice(), o2.getPrice());
		return cheapCar;
	}
}
