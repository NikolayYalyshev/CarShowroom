package CarShowroom;

import java.util.ArrayList;
import java.util.Scanner;

public class CarTax {
	static void carTax(Cars cars) {
		int horsePower = cars.getCarPower();
		int taxRate = 0; // налоговая ставка
		int carOwnershipPeriod = 1; // период владения авто
		double luxuryLax = 0; // налог на роскошь
		int benefit = 1; // льгота, расчитыавть не буду, мозг взорвется
		if (horsePower < 100){
			taxRate = 15;
		} else if ( horsePower > 100 && horsePower <= 125) {
			taxRate = 25;
		} else if ( horsePower > 125 && horsePower <= 150) {
			taxRate = 35;
		} 	else if ( horsePower > 150 && horsePower <= 175) {
			taxRate = 45;
		} else if ( horsePower > 175 && horsePower <= 200) {
			taxRate = 50;
		} else if ( horsePower > 200 && horsePower <= 225) {
			taxRate = 65;
		} else if ( horsePower > 225 && horsePower <= 250) {
			taxRate = 75;
		}else if ( horsePower > 250) {
			taxRate = 150;
		}
		 if (cars.getPrice() < 3_000_000){
			 luxuryLax = 1.0;
		 } else if (cars.getPrice() > 3_000_000 && cars.getPrice() < 5_000_000) {
			 luxuryLax = 1.5;
		 }else if (cars.getPrice() > 3_000_000 && cars.getPrice() < 5_000_000) {
			 luxuryLax = 1.5;
		 } else if (cars.getPrice() > 5_000_000 && cars.getPrice() < 10_000_000) {
			 luxuryLax = 2.0;
		 } else if (cars.getPrice() > 10_000_000 && cars.getPrice() < 15_000_000) {
			 luxuryLax = 3.0;
		 }
		 
		 double carTax = horsePower * taxRate * carOwnershipPeriod * luxuryLax;
		System.out.println("Налог на данный автомобиль: " + carTax + " рублей");
	}
}
