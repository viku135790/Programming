package Loop;
//Print reverse of given number
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		int x=n;
		
		int rev=0;
		for(int i=0; n!=0;) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev+" is the reverse number of "+x);
	}

}
