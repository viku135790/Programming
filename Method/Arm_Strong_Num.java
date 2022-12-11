package Method;
//WAP TO PRINT ARMSTRONG NO IN 1 TO 1000.

import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Arm_Strong_Num {
	public static void main(String[] args) {
		for(int i=1; i<1000; i++) {
			int n=i;
			int o=n;
			int c=countNum(n);
			
			int sum=0;
			while(n!=0) {
				int r=n%10;
				int s=powerSum(r,c);
				sum=sum+s;
				n=n/10;
			}
			if(o==sum) {
				System.out.println(o+ " is armstrong number");
			}
			
		}
		
	}

	public static int powerSum(int r, int c) {
		int pow=1;
		for(int i=1; i<=c; i++) {
			pow=pow*r;
		}
		
		return pow;
	}

	public static int countNum(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		return count;
	}

}
