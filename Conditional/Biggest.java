package Conditional;
//WAJP to find biggest number of three given number.

/*if any program is wrong then report on (viku135790@gmail.com);
 * Or u can mail your question (viku135790@gmail.com) */

import java.util.*;
public class Biggest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number");
		int a=sc.nextInt();
		System.out.println("Enter the Second number");
		int b=sc.nextInt();
		System.out.println("Enter the Third number");
		int c=sc.nextInt();

		if(a>b && a>c) {
			System.out.println("The biggest number is "+a);
		}
		else if(b>c && b>a) {
			System.out.println("The biggest number is "+b);
		}
		else if(c>a && c>b) {
			System.out.println("The biggest number is "+c);
		}
	}

}
