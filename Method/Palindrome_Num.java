package Method;
//WAP TO PRINT PALINDROME NUMBER B/W 10 TO 200.
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Palindrome_Num {
	public static void main(String[] args) {
		
		for(int i=10; i<=200; i++) {
			palindrome(i);
		}
	}
	public static void palindrome(int i) {
		int k=i;
		int rev=0;
		while(i!=0) {
			int r=i%10;
			rev=rev*10+r;
			i=i/10;
		}
		if(k==rev) {
			System.out.println(rev);
		}
	}
}
