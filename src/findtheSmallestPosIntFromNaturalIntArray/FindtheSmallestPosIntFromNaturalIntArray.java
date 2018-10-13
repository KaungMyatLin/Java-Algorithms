package findtheSmallestPosIntFromNaturalIntArray;
//Class CodilityDemo  { public int solution(int[] A); }
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//Given A = [1, 2, 3], the function should return 4.
//
//Given A = [-1, -3], the function should return 1.
//
//Assume that:
//
//N is an integer within the range [1..100,000];
//each element of array A is an integer within the range [-1,000,000..1,000,000].
//Complexity:
//
//expected worst-case time complexity is O(N);
//expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

import java.util.Arrays;

class FindtheSmallestPosIntFromNaturalIntArray {

//	public static void main(String[] args) {
//		int[] intArr = 	{ -4, -3, -2};
//						//{ -4, -1, 0, 1, 2, 3, 4, 10};
//						//{ 4, 3, 0, 1, -3, -4, 10};
//						//{ -4, -4, -3, -3, 1, 1 };
//						//{ 1, 3, 6, 4, 1, 2 };
//
//		StringBuilder sb = new StringBuilder();
//		sb.append( "Smallest positive integer that does not occur in a given sequence of int[] { ");
//		for (int i=0; i<= intArr.length-1; i++) {
//			if (i != intArr.length-1)
//				sb.append(String.valueOf( intArr[i] ) + ", ");
//			else sb.append(String.valueOf( intArr[i] ) );
//		}
//		sb.append( "} is " + findSmallposMissingInt2(intArr) ) ;
//		System.out.println(sb);
//	}
	
	public static int findSmallposMissingInt2 (int[] array) {
		Integer sPosInt = null;
		boolean havePos = false;
		
		System.out.println( Arrays.toString( array = sortsArray(array)));
		
		if (array.length > 2 && array.length < 100000) {
			for (int i=0; i < array.length -1; i++) {  
				if (array[i] > -1) {
					System.out.println("current index " + i + " is " + array[i]);
					havePos = true;
					if( array[i] + 1 != array[i+1] ) {
						sPosInt = array[i] + 1;
						return sPosInt;
					}
				}
			}
			
			if (sPosInt == null) {
				sPosInt = array[array.length -1] + 1;
			}
			
			if (havePos == false) {
				sPosInt = 1; 
			}
		}
		return sPosInt;
	}

	public static int findSmallposMissingInt (int[] array) {
		Integer sPosInt = null;
		System.out.println( Arrays.toString( array = sortsArray(array)));
		
		if (array.length > 2 && array.length < 100000) {
			for (int i=0; i < array.length -1; i++) {  
				System.out.println( "current index " + i + " is " + array[i] + " , " + "current index+1 " + (i+1) + " is " + array[i+1]);
		
				if (Math.abs(array[i+1]) - Math.abs(array[i]) > 1) { /*###important concept currentIndexElement - nextIndexElement must not equal 0 or 1.*/
					System.out.println(array[i+1] + " - " + array[i]);
					
					int plus = 1;
					while ((array[i] + plus) <= 0 && (array[i]+1) < array[i+1]) { /*###important concept if currentIndexElement + 1 still less than 0, increment++. This is for next 'if' Statement.*/
						plus++;
					}
						
					if ( (array[i] + plus) > 0 ) {
						sPosInt = array[i] + plus;
						break;
					}
				}
			}
		}

		if (sPosInt == null) {	/*###important concept if all the elements in array are whether positive then lastIndexElement+1 or negative then =1.*/ 
			if (array[array.length -1] >= 0) sPosInt = array[array.length -1] + 1;
			else sPosInt = 1;
		}

		return sPosInt;
	}

	public static int[] sortsArray (int[] array) { /*###important concept*/

		if (array != null) {
			for (int i=0; i<array.length;i++) {
				if ( array[i] < -1000000 || array[i] > 1000000) 
					throw new RuntimeException("each element of array A is an integer within the range [−1,000,000..1,000,000].");
				
			}
		}
		
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
}