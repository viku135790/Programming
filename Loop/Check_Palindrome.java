package Loop;
//WAP TO CHECK WHETHER THE NUMBER IS PALINDROME OR NOT
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Check_Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int t=n;
		
		int rev=0;
		for(int i=0; n!=0; ) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==t) {
			System.out.println("The given number is palindrome");
		}
		else {
			System.out.println("The given number is not palindrome");
		}
	}

}
