package Conditional;
//Check the input triangle or not
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Triangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first side");
		int a=sc.nextInt();
		System.out.println("Enter the size of second side");
		int b=sc.nextInt();
		System.out.println("Enter the size of third side");
		int c=sc.nextInt();
		
		if(((a+b)>c) && ((b+c)>a) && ((c+a)>b)) {
			System.out.println("Created a valid triangle by given input");
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
