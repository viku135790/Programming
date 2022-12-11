package Conditional;
//WAJP to check the given number is positive or negative
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
 * Or u can mail your question (viku135790@gmail.com) */

public class Pstv_Or_Ngtv {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		if(n>0) {
			System.out.println("This is positive number");
		}
		else if(n<0) {
			System.out.println("This is negative number");
		}
		else {
			System.out.println("Neither positive Neither negative");
		}
	}

}
