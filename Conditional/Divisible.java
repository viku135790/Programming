package Conditional;
//Check the number is divisible by 5 and 11 or not.
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Divisible {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int n=sc.nextInt();
		
		if(n%5==0 && n%11==0) {
			System.out.println("This number is divisible by 5 and 11 both");
		}
		else {
			System.out.println("This number is not divisible by 5 and 11 both");
		}
	}

}
