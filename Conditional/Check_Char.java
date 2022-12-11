package Conditional;
//WAJP to check character alphabet or not

/*if any program is wrong then report on (viku135790@gmail.com);
 * Or u can mail your question (viku135790@gmail.com) */

import java.util.*;
public class Check_Char {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character :- ");
		char m = sc.next().charAt(0);

		if(m>='a' && m<='z' || m>='A' && m<='Z'){
		System.out.println("This is character");
		}

		else{
		System.out.println("this is not a character");
		}	
	}

}
