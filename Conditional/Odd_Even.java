package Conditional;
//Check number is odd or even
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Odd_Even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println("This is even number");
		}
		else {
			System.out.println("This is odd number");
		}
	}

}
