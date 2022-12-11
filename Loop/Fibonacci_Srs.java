package Loop;
//WAP TO PRINT FIBONACCI NUMBER SERIES UPTO 10 DIGITS

import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Fibonacci_Srs {
	public static void main(String[] args) {
		int n=10;
		int f=0;
		int s=1;
		System.out.println(f);
		System.out.println(s);
		for(int i=1; i<=n; i++) {
			int r=f+s;
			f=s;
			s=r;
			System.out.println(r);
		}
	}

}
