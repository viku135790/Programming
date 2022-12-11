package Loop;
//CHECK WHETHER THE NO IS PERFECT NO OR NOT
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Perfect_Num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				sum=sum+i;
				
			}
		}
		if(sum==n) {
			System.out.println("Entered number is perfect number");
		}
		else {
			System.out.println("Entered number is not  perfect number");
		}
		
	}

}
