package intersectionofTwoSortedArrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntersectionofTwoSortedArrays {
	public List<Integer> solution(int[] A, int[] B) {
		// write your code in Java SE 8

		A = sortArray(A); B = sortArray(B);
		System.out.println( Arrays.toString(A));
		System.out.println( Arrays.toString(B));
		int i = 0, j = 0;
		List<Integer> intersect = new ArrayList<Integer>();
		
		while (i < A.length && j < B.length) {

			if ( A[i] < B[j]) i++;
			else if (A[i] > B[j]) j++;
			else
			{
				i++; j++;
				intersect.add(A[i]);
			}
		}
		
		if(intersect.isEmpty()) {return null;}
		else {return intersect;}
	}

	public int[] sortArray (int[] array) {

		for (int i=0; i<array.length-1; i++) {
			System.out.println( Arrays.toString(array));

			for (int j = i+1; j< array.length; j++) {
				System.out.println( "current index " + i + " is " + array[i] + " , " + "current index " + j + " is " + array[j]);

				if (array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}

//	public static void main(String[] args) {
//		int[] A = { 1, 3, 2, 4, 1, 6, 7};
//		int[] B = { 4, 8, 5, 7, 1, 7, 4};
//
//		System.out.println( solution( A, B).toString() );
//	}
}