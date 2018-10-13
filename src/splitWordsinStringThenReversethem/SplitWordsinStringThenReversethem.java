package splitWordsinStringThenReversethem;

import java.util.Arrays;

public class SplitWordsinStringThenReversethem {

	public static String solution(String S) {
		// write your code in Java SE 8

		String[] wordsStr = S.split("\\s+");
		System.out.println( Arrays.toString(wordsStr) );

		for (int i = 0; i < wordsStr.length; i++) {
			char c = 0;
			StringBuilder sb = new StringBuilder();
			
			for (int j = 0; j < wordsStr[i].length(); j++) {
				c = wordsStr[i].charAt( wordsStr[i].length() -j -1 );
				System.out.println( c);
				sb.append(c);
				System.out.println( sb.toString());
			}
			
			wordsStr[i] = sb.toString();
			System.out.println( Arrays.toString(wordsStr));
		}

		return "Method return " + Arrays.toString(wordsStr);
	}

	public static void main(String[] args) {

		String s = solution("we test coders");
		System.out.println(s);
	}
}
