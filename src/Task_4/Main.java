package Task_4;

public class Main {
	public static void main(String[] args) {
		String s = " Go go go, my dear    friend, go!";
		s = deleteNumbers(s);

		System.out.println(wordFind(s));
	}

	/* Метод повертає стрічку, де всі символи та цифри замінені пробілами і приведені до нижнього регістру*/
	static String deleteNumbers(String s) {
		s = s.replaceAll("[.,;:!@#$%^*()-=+{}«»0123456789]", " ");
		s = s.toLowerCase();
		return s;
	}

	 /* Метод повертає слово, яке зустрічається в стрічці найчастіше*/
	static String wordFind(String s) {
		int counterStr = 0;
		int counterArr = 0;
		String[] str = s.split(" ");
		
		/* Після розділення на масив, створюємо новий масив без пробілів та окремих літер*/
		for (String s1 : str) {
			if (s1.length() > 1) {
				counterStr++;
			}
		}
		String[] arr = new String[counterStr];
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > 1) {
				arr[counterArr] = str[i];
				counterArr++;
			}
		}
		/* Власне підрахунок слів, які повторюються */
		int indexArr[] = { 0, 0 };
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {

			if (indexArr[1] == 0) {
				counter = 1;
			} else if (!arr[indexArr[0]].equals(arr[i])) {
				counter = 1;
			} else {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].equals(arr[j])) {
					counter++;
				}
			}
			if (indexArr[1] <= counter) {
				indexArr[1] = counter;
				indexArr[0] = i;
			}
		}
		return (arr[indexArr[0]]);
	}

}
