package Method;
//DESIGN A METHOD TO CALCULATE ADDITION OF ALL DIGITS PRESENT IN A NUMBER AND RETURN THE SUM.
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Addition_All_Dgt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		
		int a=addition(n);
		System.out.println("The sum of all digit is = "+a);
		
	}

	public static int addition(int n) {
		int sum=0;
		while(n!=0) {
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		return sum;
	}

}
