package Method;
//WAP TO CHECK NUMBER IS STRONG NUMBER OR NOT
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */
public class Strong_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		int s=n;
		
		int sum=0;
		while(n!=0) {
			int r=n%10;
			int f=findfact(r);
			sum=sum+f;
			n=n/10;
		}
		if(sum==s) {
			System.out.println(s+" is Strong number");
		}
		else {
			System.out.println("Given number is not strong");
		}
	}

	public static int findfact(int r) {
		
		int fact=1;
		while(r!=0) {
			fact=fact*r;
			r--;
		}
		return fact;
	}

}
