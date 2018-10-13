package fibonacci;

/**
 * This program prints out the first 20 numbers in the Fibonacci sequence. Each
 * term is formed by adding together the previous two terms in the sequence,
 * starting with the terms 1 and 1.
 */

public class Fibonacci {

	public static void main(String[] args) 
	//{ for (int i=-1; i <= 6; i++) System.out.print(fibonacci(i) + " "); 	}
	//{ System.out.print(recursive_fibonacci(2) + " "); }
	{ System.out.print(fibonacci2(8)); }
	
	
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
	public static Integer fibonacci (int position) {

		if (position < 0) return null; //int data type is value so null is unable to be used.
		if (position == 0) return 0;
		if (position <= 2) return 1;
		int n0 = 1, n1 = 1, n2 = 1;

		for (int i=3; i < position; i++) {
			n2 = n1 + n0;
			n0 = n1;
			n1 = n2;
		}
		return n2;
	}
	
	public static int recursive_fibonacci(int position)
    {
		if (position <= 0) return 0;
        if (position <=2) return 1;
        return recursive_fibonacci(position-1) + recursive_fibonacci(position-2);
    }
	
	public static int fibonacci2 (int fibNo) {
		int ans = 0, previous = 0, pos = 0;

		for (int current=1; ans <= fibNo; current = ans) {
			ans = current + previous;
			previous = current;
			pos++;
		}
		return pos;
	}
}
