package Method;
//WAP TO PRINT SPECIAL NO B/W 10 AND 100

import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Spl_Num {
	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			int n=i;
			int s=sumOfDgt(n);
			int p=prdctOfDigit(n);
			
			if(s+p==n) {
				System.out.println(n+" is special number");
			}
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
