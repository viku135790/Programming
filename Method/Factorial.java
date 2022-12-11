package Method;
//WAP TO CALCULATE FACTORIAL OF A NUMBER
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		int x=facto(n);
		System.out.println("Factorial of "+n+" = "+x);
		
	}

	public static int facto(int n) {
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n=n-1;
		}
		return fact;
	}

}
