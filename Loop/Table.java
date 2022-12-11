package Loop;
//Write a program to generate table of given number till 10;
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Table {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number, U want to table:- ");
		int a=sc.nextInt();
		System.out.println("Upto");
		int b=sc.nextInt();
		
		int table=1;
		for(int i=1; i<=b; i++) {
			table=a*i;
			System.out.println(a+"*"+i+" = "+table);
		}
	}

}
