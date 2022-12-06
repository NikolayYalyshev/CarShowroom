package CarShowroom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class selectionPrice implements Comparator<Cars> {
	@Override
	public int compare(Cars o1, Cars o2) {
		int price = Integer.compare(o1.getPrice(), o2.getPrice());
		return price;
	}
	static ArrayList<Cars> getSelectionCarPrice(ArrayList<Cars> cars){
		System.out.println("До какой суммы рассмативаете автомобиль?");
		Scanner scanner = new Scanner(System.in);
		int sum = scanner.nextInt();
		ArrayList<Cars> reCars = new ArrayList<>();
			if (sum <= 0){
				System.out.println("Ошибка, сумма не может быть отрицательной");
			}
			else {
				for (int i = 0; i < cars.size(); i++) {
				if (cars.get(i).getPrice() <= sum){
					reCars.add(cars.get(i));
				}
			}
		}
		return reCars;
	}
	
	
}
