package Loop;
//Generate fibonacci series from 0 to 50;
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Fibonacci_Series {
	public static void main(String[] args) {
		int n=50;
		//lets assume the first number of this series is a=0
		int a=0;
		//lets assume the second number of this series is b=1
		int b=1;
		System.out.println("This is the number of this series");
		System.out.println(a);
		System.out.println(b);
		
		for(int i=1; i<=n; i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}
