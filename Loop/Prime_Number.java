package Loop;
//WAP TO CHECK WHETHER NUMBER IS PRIME NO OR NOT

import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Prime_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		
		int c=checkPrime(n);
		if(c==1) {
			System.out.println(n+" is prime number");
		}
		else {
			System.out.println(n+" is not prime number");
		}
	}

	public static int checkPrime(int n) {
		int count=0;
		for(int i=2; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count;
	}
	
}
