package Loop;
//WAP TO COUNT EVEN DIGITS IN A NUMBER.
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Cnt_Even_Dgt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		
		int count=0;
		while(n!=0) {
			int r=n%10;
			if(r%2==0) {
				count++;
			}
			n=n/10;
		}
		System.out.println("Total even digit in given number is = "+count);
	}

}
