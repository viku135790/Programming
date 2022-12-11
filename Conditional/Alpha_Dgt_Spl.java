package Conditional;
//Check the character is alphabet or digit or special character
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Alpha_Dgt_Spl {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char c=sc.next().charAt(0);
		
		if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
			System.out.println("This is alphabet");
		}
		else if(c>='0' && c<='9') {
			System.out.println("This is digit");
		}
		else {
			System.out.println("This is special character");
		}
	}
}
