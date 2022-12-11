package Method;
//WAP TO PRINT THE STRONG NUMBER B/W 1 TO 1000.

import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Strong_Num {
	public static void main(String[] args) {
		for(int i=1; i<1000; i++) {
			int n=i;
			int s=n;
			int sum=0;
			while(n!=0) {
				int r=n%10;
				int f=findfact(r);
				sum=sum+f;
				n=n/10;
			}
			if(sum==s) {
				System.out.println(s+" is Strong number");
			}
			
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
