package Method;
//WAP TO CALCULATE SUM OF FACTORIAL OF EVEN DIGITS IN A NUMBER.
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Factorial_Sum_Odd_Dgt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		
		int sum=0;
		while(n!=0) {
			int r=n%10;
			if(r%2==0) {
				int f=facto(r);
				sum=sum+f;
			}
			n=n/10;
		}
		System.out.println("Sum of even Digit of "+" = "+sum);
	}

	public static int facto(int r) {
		int fact=1;
		while(r!=0) {
			fact=fact*r;
			r=r-1;
		}
		return fact;
	}

}
