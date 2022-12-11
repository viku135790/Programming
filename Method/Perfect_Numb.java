package Method;
//WRITE PROGRAM FOR PERFECT NO 28 AND 6
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Perfect_Numb {
	public static void main(String[] args) {
		int n=28;
		int m=6;
		per(n);
		perf(m);
	}

	public static void perf(int m) {
		int sum=0;
		for(int i=1; i<m; i++) {
			if(m%i==0) {
				sum=sum+i;
			}
		}
		if(sum==m) {
			System.out.println("6 is perfect number");
		}
		else {
			System.out.println("Entered number is not  perfect number");
		}
		
	}

	public static void per(int n) {
		int sum=0;
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println("28 is perfect number");
		}
		else {
			System.out.println("Entered number is not  perfect number");
		}
		
	}

}
