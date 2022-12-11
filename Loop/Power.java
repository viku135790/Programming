package Loop;
// WAJP to print a to the b;
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Power {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:- ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:- ");
		int b=sc.nextInt();
		int x=b;
		
		int power=1;
		for(int i=0; b!=0; ) {
			power=power*a;
			b--;
		}
		System.out.println("The value of " +a+" to the power of "+x+" is  =  "+ power);
	}

}
