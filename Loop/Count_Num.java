package Loop;
//Write a program to count the number.
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Count_Num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number u want to count");
		long l=sc.nextInt();
		
		int count=0;
		while(l!=0) {
			count++;
			l=l/10;
		}
		System.out.println("Total count of given number =" +count);
	}
}
