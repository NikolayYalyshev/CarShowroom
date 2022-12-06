package CarShowroom;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Cars car1 =
				new Cars("Mitsubishi", "Outlander XL", 2010, 2.0, 148, 170000,
						1000000);
		Cars car2 =
				new Cars("Volkswagen", "Jetta", 2013, 1.6, 105, 146000, 890000);
		Cars car3 =
				new Cars("Lada", "TurboPushka", 2004, 1.6, 89, 99000, 1200000);
		Cars car4 = new Cars("HZ", "Pyshka", 2017, 3.5, 249, 10000, 500000);
		
		
		ArrayList<Cars> cars = new ArrayList<>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		System.out.println("Добро пожаловать в автосалон \"Николай.Авто\"");
		System.out.println("Открыть меню? (Yes/No) ");
		Scanner scanner = new Scanner(System.in);
		String menu = scanner.nextLine();
		String yes = "Yes";
		String no = "No";
		if (menu.equals(yes)){
			System.out.println("1. Найти самый дешевый автомобиль\n2. " +
					"Найти самую старую машину\n3. Найти самую новую " +
					"машину\n4. Пободрать автомобиль до заданной цены");
			System.out.println("Нажмите необходимую цифру из списка меню");
			int menu1 = scanner.nextInt();
			switch (menu1) {
				case 1:
					Collections.sort(cars, new cheapCar()); // дешевый авто
					System.out.println(
							"Мы подобрали для вас самый дешевый автомобиль!");
					System.out.println(cars.get(0));
					System.out.println("Расчитать налог на данный автомобиль?" +
							" (Yes/No)");
					Scanner scanner1 = new Scanner(System.in);
					String menu2 = scanner1.nextLine();
					if (menu2.equals(yes)){
						CarTax.carTax(cars.get(0)); // налог
					} else {
						System.out.println("Хорошего дня!");
					}
					break;
				case 2:
					Collections.sort(cars, new oldCar()); // самый поздний авто
					System.out.println(
							"Мы подобрали для вас самый поздний автомобиль!");
					System.out.println(cars.get(0));
					System.out.println("Расчитать налог на данный автомобиль?" +
							" (Yes/No)");
					Scanner scanner2 = new Scanner(System.in);
					String menu3 = scanner2.nextLine();
					if (menu3.equals(yes)){
						CarTax.carTax(cars.get(0)); // налог
					} else {
						System.out.println("Хорошего дня!");
					}
					break;
				case 3:
					Collections.sort(cars, new youngCar()); //свежий авто
					System.out.println(
							"Мы подобрали для вас самый свежий автомобиль!");
					System.out.println(cars.get(0));
					System.out.println("Расчитать налог на данный автомобиль?" +
							" (Yes/No)");
					Scanner scanner3 = new Scanner(System.in);
					String menu4 = scanner3.nextLine();
					if (menu4.equals(yes)){
						CarTax.carTax(cars.get(0)); // налог
					} else {
						System.out.println("Хорошего дня!");
					}
					break;
				case 4:
					Collections.sort(cars, new selectionPrice()); // до опред суммы
					ArrayList<Cars> reCars = selectionPrice.getSelectionCarPrice(cars);
					System.out.println(reCars.toString());
					System.out.println("Расчитать налог на пердставленные " +
							"автомобили?" +
							" (Yes/No)");
					Scanner scanner4 = new Scanner(System.in);
					String menu5 = scanner4.nextLine();
					if (menu5.equals(yes)){
						for (int i = 0; i < reCars.size(); i++) {
							System.out.print(reCars.get(i).getModel() + " ");
							CarTax.carTax(cars.get(i));
						}
					} else {
						System.out.println("Хорошего дня!");
					}
					break;
			}
			System.out.println("");
			System.out.println("Спасибо, что посетили наш сайт. Хорошего дня.");
		}
		if (menu.equals(no)) {
			System.out.println("Хорошего дня!");
		}
	}
}