package Task_3;

public class Main {
	static int howManyWords(String str) {
		return HowManyWords.giveCount(str);
	}

	public static void main(String[] args) {
		
		String s = new String(" Добрі вісті   не лежать на місці ! 336 45 4   ");
		System.out.printf("Речення має %d слів.\n", howManyWords(s));
		
		int a=howManyWords("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		System.out.printf("Речення має %d слів.\n", a);
	}
}
