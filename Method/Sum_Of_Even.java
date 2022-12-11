package Method;
/*DESIGN A METHOD TO CALCULATE SUM OF EVEN DIGITS AND RETURN, 
 * INSIDE MAIN METHOD CALCULATE SQUARE OF RETURNING RESULT.
 * */
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Sum_Of_Even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		
		int es=evensum(n);
		System.out.println("The sum of even digit is = "+es);
		
		int s=square(es);
		System.out.println("THe square of sum of even digit is = "+s);
	}

	public static int square(int es) {
		int sqr=es*es;
		return sqr;
	}

	public static int evensum(int n) {
		int sum=0;
		while(n!=0) {
			int r=n%10;
			if(r%2==0) {
				sum=sum+r;
			}
			n=n/10;
		}
		return sum;
	}
}
