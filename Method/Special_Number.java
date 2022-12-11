package Method;
//WAP TO CHECK SPECIAL TWO DIGIT NUMBER.

import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Special_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		
			int s=sumOfDgt(n);
			int p=prdctOfDigit(n);
			
			if(s+p==n) {
				System.out.println(n+" is special number");
			}
		
	}

	private static int prdctOfDigit(int n) {
		int prod=1;
		while(n!=0) {
			int r=n%10;
			prod=prod*r;
			n=n/10;
		}
		return prod;
	}

	private static int sumOfDgt(int n) {
		int sum=0;
		while(n!=0) {
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		return sum;
	}

}
