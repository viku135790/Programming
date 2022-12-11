package Conditional;
//WAJP for Quadratic Equation
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Quadratic_Equation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a  ");
		double a=sc.nextDouble();
		System.out.println("Enter the value of b  ");
		double b=sc.nextDouble();
		System.out.println("Enter the value of c  ");
		double c=sc.nextDouble();
		
		double d=((b*b)-(4*a*c));
		if(d>=0) {
			System.out.println("The root is possible");
			double p=(-b+Math.sqrt(d))/(2*a);
			double q=(-b-Math.sqrt(d))/(2*a);
			System.out.println("The first root is " +p);
			System.out.println("The second root is " +q);
		}
		else {
			System.out.println("Root is not possible");
		}
	}

}
