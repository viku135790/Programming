package Loop;
//WAP TO PRINT DIVISORS OF 10
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Divisors {
	public static void main(String[] args) {
		int n=10;
		
		System.out.println("These numbers are divisors of 10");
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
	
}
