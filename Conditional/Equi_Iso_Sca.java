package Conditional;
//Check the Triangle is equilateral or isoscales or scalene
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Equi_Iso_Sca {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first side");
		int a=sc.nextInt();
		System.out.println("Enter the size of second side");
		int b=sc.nextInt();
		System.out.println("Enter the size of third side");
		int c=sc.nextInt();
		
		if(((a+b)>c) && ((b+c)>a) && ((c+a)>b)) {
			if(a==b && b==c && c==a) {
				System.out.println("This is Equilateral Triangle");
			}
			if((a==b && c!=a && c!=b) || (b==c && a!=b && a!=c) || (c==a && b!=c && b!=a)) {
				System.out.println("This is Isosceles Triangle");
			}
			if(a!=b && b!=c && c!=a) {
				System.out.println("This is Scalene Triangle");
			}
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
