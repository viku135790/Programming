package Conditional;
//WRITE ONE PROGRAM FOR NESTED if, else if
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
 * Or u can mail your question (viku135790@gmail.com) */

public class Nested_if {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int a=sc.nextInt();
		
		
		if(a>10) {
			if(a<100) {
				if(a<=70) {
					System.out.println("I am nested if");
				}
			}
			
			else if(a>100) {
				if(a<200) {
					System.out.println("I am nested else if");
				}
				else if(a>200){
					System.out.println("i am nested else if");
				}
			}
			
		}
		
	}

}
