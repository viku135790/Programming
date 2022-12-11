package Method;
//WAP TO CALCULATE CUBE OF EVERY DIGIT IF DIGIT IS ODD IN A NUMBER.
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Cube_Odd_Dgt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		
		while(n!=0) {
			int r=n%10;
			cube(r);
			n=n/10;
		}
	}

	public static void cube(int r) {
		if(r%2!=0) {
			int cb=1;
			for(int i=0; i<3; i++) {
				cb=cb*r;
			}
			System.out.println("The cube of odd number  "+r+" is = "+cb);
		}
		
	}

}
