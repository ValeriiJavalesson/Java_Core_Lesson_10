package Task_2;

import java.lang.reflect.Array;

public class ReplaceSymbols {

	public static void main(String[] args) {
		String s = new String("Добрі вісті не лежать на місці");
				s = s.replaceAll("[aeiouyаоуеиії]", "-");
		System.out.println(s);
	}
}
