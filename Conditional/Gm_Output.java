package Conditional;
//WAP TO PRINT GOODMORNING WHEN INPUT THE NO IS 8.
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
 * Or u can mail your question (viku135790@gmail.com) */


public class Gm_Output {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		if(n==8) {
			System.out.println("Good Morning !");
		}
		else {
			System.out.println("For good morning press 8");
		}
	}

}
