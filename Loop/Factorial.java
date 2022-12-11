package Loop;
//WAJP to print factorial of given number
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:- ");
		int n=sc.nextInt();
		
		
		int facto=1;
		for(int i=1; i<=n; i++) {
			facto=facto*i;
		}
		System.out.println(facto+" is the factorial of "+n);
	}

}
