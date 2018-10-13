import java.util.ArrayList;
import java.util.List;

public class ShuffleFirstLast2ndFirst2ndLastDigits123456Into162534Order {
	/* 
	shuffle a number�s digit in the following way: 
	alternatively write one digit from the front of the number and one digit from the back, 
	then the second digit from the front and second digit from the back, 
	and so on until the length of the shuffle number is the same as that of the original.
	*/

    public int shuffle(int A) {
        String num = String.valueOf(A); 
        
        if (A > 0 && A < 100000000) {
            List<Character> cArr = new ArrayList<Character>();
            for (char c: num.toCharArray()) {
            	cArr.add(c);
            }
            
            System.out.println(cArr.toString());
            StringBuilder sb = new StringBuilder();
            
            int i = 0;
            int loopCount = cArr.size() / 4;
            int loopRemainder = cArr.size() % 4;
            System.out.println("loopCount is " + loopCount + ", loopRemainder is " + loopRemainder);
            
            do { 
                System.out.println("Loop " + i);
                
                if ( i >= 1 && (cArr.size() % 4) == 0 ) {
                    System.out.println( "Before remove first digit " + cArr.toString());
        			sb.append(cArr.get(0));
        			cArr.remove(0);
                    System.out.println( "Before remove last digit " + cArr.toString());
        			sb.append(cArr.get(cArr.size()-1));
        			cArr.remove(cArr.size()-1);
                    System.out.println( "Before remove 2nd first digit " + cArr.toString());
        			sb.append(cArr.get(0));
        			cArr.remove(0);
                    System.out.println( "Before remove 2nd last digit " + cArr.toString());
        			sb.append(cArr.get(cArr.size()-1));
        			cArr.remove(cArr.size()-1);
        		}
                
                if ( (cArr.size() % 4) != 0) {
                	if (loopRemainder < 2 ) {
                        System.out.println( "Before remove first digit " + cArr.toString());
            			sb.append(cArr.get(0));
            			cArr.remove(0);
            		}
            		else if (loopRemainder < 3) {
                        System.out.println( "Before remove first digit " + cArr.toString());
            			sb.append(cArr.get(0));
            			cArr.remove(0);
                        System.out.println( "Before remove last digit " + cArr.toString());
            			sb.append(cArr.get(cArr.size()-1));
            			cArr.remove(cArr.size()-1);
            		}
            		else if (loopRemainder < 4) {
                        System.out.println( "Before remove first digit " + cArr.toString());
            			sb.append(cArr.get(0));
            			cArr.remove(0);
                        System.out.println( "Before remove last digit " + cArr.toString());
            			sb.append(cArr.get(cArr.size()-1));
            			cArr.remove(cArr.size()-1);
                        System.out.println( "Before remove 2nd first digit " + cArr.toString());
            			sb.append(cArr.get(0));
            			cArr.remove(0);
            		}
                }
            	i++;
            }
            while (i <= loopCount);
            
            System.out.println("After removing loops " + cArr.toString());
            System.out.println("Wanted Int: " + sb.toString());
            num = sb.toString();
        }
        return Integer.valueOf(num);
    }
    
//    public static void main(String[] args) {
//		int p = shuffle(123456);
//        System.out.println(p);
//	}
}
