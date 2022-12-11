package Method;
//DESIGN A METHOD TO COUNT NO OF DIGITS IN A NUMBER

import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Cnt_Num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		
		int c=countNumb(n);
		System.out.println("Total digit in number = "+c);
	}

	public static int countNumb(int n) {
		int count=0;
		for(int i=0; n!=i; ) {
			count++;
			n=n/10;
		}
		return count++;
	}

}
