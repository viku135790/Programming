package Method;
//DESIGN A METHOD TO RETURN FACTORIAL OF EACH DIGIT IN A NUMBER

import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Facto_Each_Dgt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		
		while(n!=0) {
			int r=n%10;
			int f=findfact(r);
			n=n/10;
			System.out.println("The factorial of "+r+" = "+f);
		}
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
