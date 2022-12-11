package Loop;
//WAJP to swap the values of two variables
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Swap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:- ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:- ");
		int b=sc.nextInt();
		
		int c=0;
		c=a;
		a=b;
		b=c;
		
		System.out.println("The value of a "+a);
		System.out.println("The value of b "+b);
	}

}
