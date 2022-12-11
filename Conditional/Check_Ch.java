package Conditional;
//WAJP to check character is lowercase or uppercase.

import java.util.Scanner;

/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Check_Ch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character :- ");
		char m = sc.next().charAt(0);

		if(m>='a' && m<='z'){
		System.out.println("The character is in lowercase");
		}
		
		else if(m>='A' && m<='Z') {
			System.out.println("The character is in Uppercase");
		}

		else{
		System.out.println("this is not a character");
		}	
	}

}
