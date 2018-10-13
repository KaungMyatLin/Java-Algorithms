public class CheckASCIICharsUpperLowerDigitOrOther {
	/*
	 a function that should return a string describing first character of the given string:
	 "digit" for a digt, "lower" for a lowercase letter, "upper" for an uppercase letter
	 , and "other" for other characters. Assume the characters are ASCII.
	 */
	// public static void main(String[] args) { System.out.println(solution("lowercase")); }
	
	public String solution(String s) {
        char c = s.charAt(0);
        
        String f = null;
        if (Character.isLetter(c) && Character.isUpperCase(c)) {  // please fix condition
            return f="upper";
        } else if (Character.isLetter(c) && Character.isLowerCase(c)) {  // please fix condition
            return f="lower";
        } else if (!Character.isLetter(c)) {  // please fix condition
            return f="digit";
        } else if ((!Character.isLetter(c)) && (Character.UnicodeBlock.of(c)==Character.UnicodeBlock.BASIC_LATIN) ) {
            return f="other";
        }
        return f;
    }
}
