package Method;
//WAP TO DESIGN A METHOD TO RETURN FACTORIAL OF EACH DIGIT IN A NUMBER AND CALCULATE SUM

import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Each_Dgt_Fact_Sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		
		int sum=0;
		while(n!=0) {
			int r=n%10;
			int f=findfact(r);
			sum=sum+f;
			n=n/10;
			System.out.println("The factorial of "+r+" = "+f);
		}
		System.out.println("The sum of each digit fact = "+sum);
	}

	public static int findfact(int r) {
		
		int fact=1;
		while(r!=0) {
			fact=fact*r;
			r--;
		}
		return fact;
	}

}
