package Conditional;

/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

//check input year leap year or not.....................
import java.util.*;

public class Leap_year {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int n=sc.nextInt();
		
		if(n%100!=0) {
			if(n%4==0) {
				System.out.println(n+" is leap year.");
			}
			else {
				System.out.println("Entered year is not leap year");
			}
		}
		else if(n%400==0) {
			System.out.println(n+" is leap year.");
		}
		else {
			System.out.println("Entered year is not leap year");
		}
		
	}

}
