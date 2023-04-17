package Task_1;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		while (flag) {
			StringBuffer sb = new StringBuffer(scan.next());
			if (sb.length() == 5) {

				StringBuffer sb2 = new StringBuffer(sb);
				if (sb2.toString().equalsIgnoreCase(sb.reverse().toString())) {
					System.out.println("Це слово - паліндром.");
				} else {
					System.out.println("Це слово не паліндром.");
				}
				flag = !flag;
			} else {
				if (sb.length() > 5)
					System.out.println("Введене слово має більше 5 символів");
				else
					System.out.println("Введене слово має менше 5 символів");
				System.out.println("Спробуйте ще раз");
			}
		}
	}
}
