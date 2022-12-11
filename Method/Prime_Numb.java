package Method;
//WAP TO PRINT PRIME NUMBER B/W 1 TO 50

import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Prime_Numb {
	public static void main(String[] args) {
		for(int i=0; i<=50; i++) {
			int n=i;
			int c=checkPrime(n);
			if(c==1) {
				System.out.println(n+" is prime number");
			}
			
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
