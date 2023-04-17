/*
 * Клас видаляє з речення всі цифри
 * та рахує кількість слів, довжина яких
 * більше одного символа.
 * */
package Task_3;

/**
 * @author VALERKO
 * @since java 1.8.0
 * @version 2.0
 * 
 */

public class HowManyWords {
	int counter = 0;

	/* Метод повертає стрічку без цифр та знаків пунктуації */
	static String deleteNumbers(String s) {
		s = s.replaceAll("[.,;:!@#$%^*()-=+{}«»0123456789]", "");
		return s;
	}

	/* Метод рахує кількість слів */
	public static int giveCount(String s) {

		int counter = 0;
		String sb2 = new String(deleteNumbers(s));
		String[] arr = sb2.split(" ");

		for (String s1 : arr) {
			if (s1.length() > 1) {
				counter++;
			}
		}
		return counter;
	}
}
