package Method;
/*WAP TO CREATE A METHOD TO PERFORM ADDITION OF TWO NOS THEN 
 * INSIDE THE MAIN METHOD CHECK THE ADDITION OF TWO NOS IS EVEN OR ODD.
 * */
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Addition_Two_Num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :- ");
		int n=sc.nextInt();
		System.out.println("Enter the second number :- ");
		int m=sc.nextInt();
		
		int s=summ(n,m);
		if(s%2!=0) {
			System.out.println("Sum of given number is odd");
		}
		else if(s%2==0) {
			System.out.println("Sum of given number is even");
		}
	}

	public static int summ(int n, int m) {
		int sum=m+n;
		
		return sum;
	}

}
