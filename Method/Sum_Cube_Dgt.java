package Method;
//CALCULATE SUM OF CUBE OF EACH DIGIT IF DIGIT IS ODD

import java.util.Scanner;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Sum_Cube_Dgt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		
		int sum=0;
		while(n!=0) {
			int r=n%10;
			if(r%2!=0) {
				int c=sumcube(r);
				sum=sum+c;
			}
			n=n/10;
		}
		System.out.println("The sum of cube of odd digit = "+sum);
	}

	public static int sumcube(int r) {
		int cube=r*r*r;
		return cube;
		
	}

}
