package Method;
//WAP TO CHECK NO IS ARMSTRONG NUMBER

import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Armstrong_Numb {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
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
		else {
			System.out.println(o+ " is not armstrong number");
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
