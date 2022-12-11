package Loop;
//WAP TO PRINT ODD DIGITS IN A NUMBER
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Prt_Odd_Dgt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		
		while(n!=0) {
			int r=n%10;
			if(r%2!=0) {
				System.out.println(r);
			}
			n=n/10;
		}
	}


}
