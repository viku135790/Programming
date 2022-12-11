package Method;
//DESIGN A METHOD TO RETURN SQUARE OF THE NO
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Sqr_Num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		
		int s=sqr(n);
		System.out.println("The square of "+n+" = "+s);
	}

	public static int sqr(int n) {
		int square=n*n;
		return square;
	}

}
