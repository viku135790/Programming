package Loop;
//WAJP to check the number divisible by 13 between two variable a and b
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Divisible {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:- ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:- ");
		int b=sc.nextInt();
		
		if(a<=b) {
			for(int i=a; i<=b; i++) {
				if(i%13==0) {
					System.out.println(i+" = is divisible by 13");
				}
			}
		}
		else if(b<=a) {
			for(int i=b; i<=a; i++) {
				if(i%13==0) {
					System.out.println(i+" = is divisible by 13");
				}
			}
		}
	}

}
