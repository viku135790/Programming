package Loop;
//WAJP to find sum of natural number
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Sum_Natural_Num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:- ");
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=0; i<=n; i++) {
			sum=sum+i;
		}
		System.out.println("The sum of natural number of "+n+" is ="+sum);
		
	}

}
