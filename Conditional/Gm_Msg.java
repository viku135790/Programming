package Conditional;
//WAP TO DISPLAY MESSAGE GOOD MORNING WHEN NUMBER IS 8 AND NUMBER EQUALS TO 10 AND NUMBER EQUALS TO 11.
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
 * Or u can mail your question (viku135790@gmail.com) */


public class Gm_Msg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 8 or 10 or 11 ... Enter any number");
		int n=sc.nextInt();
		
		if(n==8 || n==10 || n==11 ) {
			System.out.println("GOOD MORNING");
		}
		
	}

}
