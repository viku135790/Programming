package Conditional;
//WAP TO CHECK WHETHER THE PERSON IS ELIGIBLE TO MARRY OR NOT.
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
 * Or u can mail your question (viku135790@gmail.com) */


public class Age_Condition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:- ");
		int n=sc.nextInt();
		
		
		if(n>=18 && n<=30) {
			System.out.println("Person is ready to marry");
		}
		else if(n<18) {
			System.out.println("Person is not ready to marry");
		}
		else if(n>30 && n<=100) {
			System.out.println("Person is ready to saadhu baba");
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}
