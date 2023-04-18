package Task_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Car[][] cars = new Car[new Random().nextInt(5, 8)][new Random().nextInt(2, 4)];

		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars[i].length; j++) {
				cars[i][j] = new Car();
			}
		}
		System.out.println("Введіть номер завдання:");
		System.out.println("1.Вивести toString() даних елементів масиву на консоль.");
		System.out.println("2.Для всіх об`єктів даного масиву засетити одинаковий  об`єкт класу Авто");
		switch (scan.next()) {
		case "1": {
			System.out.println(Arrays.deepToString(cars));
			break;
		}
		case "2": {
			Car carOne = new Car();
			for (Car[] c : cars) {
				Arrays.fill(c, carOne);
				System.out.println(Arrays.deepToString(cars));
			}
			break;
		}
		}
	}
}
