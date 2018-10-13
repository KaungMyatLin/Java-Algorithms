package prime_number;

import java.util.ArrayList;
import java.util.List;

public class Prime_Number {

	static List<Integer> Primes = new ArrayList<Integer>();
	
	public boolean checkPrime (int n) {
		
		boolean isPrime = true;
		
		for (int checker = 2; checker <= n; checker++) {
				if (checker != n && n % checker == 0) {
					isPrime = false;
					return isPrime;
			}
		}
		
		System.out.println( n + " is a Prime.");
		return isPrime;
	}
	
//	public static void main(String[] args) {
//
//		Primes.add(2);
//		int max = 100;
//
//		for (int i=3; i<= max; i++) {
//
//			if ( checkPrime (i) ) {
//				Primes.add(i);
//				System.out.println( "added");
//			}
//		}
//
//		System.out.println(Primes);
//	}
}
