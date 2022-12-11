package Loop;
//WAJP to print fibonacci series upto 10

/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Fibonacci {
	public static void main(String[] args) {
		int n=10;
		//lets assume the first of the series is 0
		int a=0;
		//lets assume the first of the series is 1
		int b=1;
		System.out.println("This is the series");
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
