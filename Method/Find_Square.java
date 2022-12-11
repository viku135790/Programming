package Method;
//WAP TO CALCULATE SQUARE OF THE DIGIT IN A NUMBER.IF THE DIGIT IS EVEN THEN ONLY FIND THE SQUARE.
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Find_Square {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		
		while(n!=0) {
			int r=n%10;
			square(r);
			n=n/10;
		}
		
	}
	public static void square(int r) {
		if(r%2==0) {
			int sqr=1;
			for(int i=0; i<2; i++) {
				sqr=sqr*r;
			}
			System.out.println("The square of even number  "+r+" is = "+sqr);
		}
	}

}
