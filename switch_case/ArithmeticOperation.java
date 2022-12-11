package switch_case;

/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */
import java.util.*;

public class ArithmeticOperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter the value of a :- ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b :- ");
		int b=sc.nextInt();
		
		System.out.println("Which operation do you want to perform (+, -, *, /, %)");
		char c=sc.next().charAt(0);
		
		switch(c) {
			case '+' :
				System.out.println("The sum of given number = "+(a+b));
				break;
			case '-' :
				System.out.println("The subtraction of given number = "+(a-b));
				break;
			case '*' :
				System.out.println("The multiplication of given number = "+(a*b));
				break;
			case '/' :
				System.out.println("The division of given number = "+(a/b));
				break;
			case '%' :
				System.out.println("The mod of given number = "+(a%b));
				break;
			
			default:
				System.out.println("Invalid input");
		}
	}

}
