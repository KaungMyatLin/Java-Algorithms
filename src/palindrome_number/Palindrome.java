package palindrome_number;

import java.math.BigInteger;

public class Palindrome {

	public static boolean hiddenBoolean = true;
//	public static void main(String [] args) {
//
//		BigInteger Bi = new BigInteger("999999"); //Change Input for any digits
//		System.out.println(findPalindrome(Bi));
//	}

	private BigInteger findPalindrome(BigInteger bi) {

		if (bi.compareTo(BigInteger.ZERO) < 0) { //Comparing with 0 and the compare result Less than zero means the input digit is negative.
			throw new IllegalStateException("negative");
		}
		
		if (isPalindrome(bi)) 
		{ // first check the digit is already single-digit Palindrome? After reverse add, second check the digit became Palindrome.
			System.out.println(bi + " is already a Palindrome.");
			return bi;
		}
		
		//While this boolean is hidden with code, it will always be true as it is set.
		if (hiddenBoolean)
			System.out.println("Trying to compute " + bi + " 's Palindrome number.");
		
		return findPalindrome(bi.add(findReverseNumber(bi)));
	}


	protected final int MAX_DIGITS = 255;

	private boolean isPalindrome(BigInteger bi) {

		String strBi = bi.toString();
		int numDigits = strBi.length();
		if (numDigits > MAX_DIGITS) 
			throw new IllegalStateException("too big");

		if (numDigits == 1)
			return true;
		for (int i=0; i < numDigits/2; i++) {
			if ( strBi.charAt(i) != strBi.charAt(numDigits-1 - i) ) 
			{ //numDigit -1 because 0 based char and -i because index from right same as left.
				
				System.out.println(numDigits);
				System.out.println(i);
				System.out.println(numDigits - i - 1);
				return false;
			}
		}
		return true;
	}

	private BigInteger findReverseNumber(BigInteger bi) {
		String strBi = bi.toString();
		int numDigits = strBi.length();
		
		char[] charBi = new char[numDigits];
		for (int i=0; i< strBi.length(); i++) {
			charBi[i] = strBi.charAt(numDigits-1 -i); 
		}
		
		return new BigInteger(new String(charBi));
	}


}
