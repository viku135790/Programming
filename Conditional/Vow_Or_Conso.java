package Conditional;
//WAJP to check the number is vowel or consonants 

import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Vow_Or_Conso {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character:- ");
		char c=sc.next().charAt(0);
		
		if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
				System.out.println("This is vowel ");
			}
			else {
				System.out.println("This is consonant");
			}
			
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
