package Method;
//DESIGN A METHOD TO RETURN POWER OF A NO (n^m)

import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Power {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :- ");
		int n=sc.nextInt();
		System.out.println("Enter the second number :- ");
		int m=sc.nextInt();
		
		int p=power(n,m);
		System.out.println("The value of "+n+"^"+m+" = "+p);
	}

	public static int power(int n, int m) {
		int pow=1;
		for(int i=1; i<=m; i++) {
			pow=pow*n;
		}
		return pow;
	}

}
