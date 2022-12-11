package Method;
//WAP TO EXTRACT THE DIGIT IN A NO IF THE DIGIT IS EVEN THEN FIND FACTORIAL.
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Factorial_Of_Dgt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		
		while(n!=0) {
			int r=n%10;
			if(r%2==0) {
				facto(r);
			}
			n=n/10;
		}
	}

	public static void facto(int r) {
		int x=r;
		int fact=1;
		while(r!=0) {
			fact=fact*r;
			r=r-1;
		}
		System.out.println("Factorial of even digit of "+x+" = "+fact);
	}

}
