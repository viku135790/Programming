package switch_case;

/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */
import java.util.*;
public class Week {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for display the day");
		int n=sc.nextInt();
		
		switch(n) {
			case 1:
				System.out.println("Represent Sunday");
				break;
			
			case 2:
				System.out.println("Represent Monday");
				break;
			
			case 3:
				System.out.println("Represent Tueday");
				break;
			
			case 4:
				System.out.println("Represent Wednesday");
				break;
			
			case 5:
				System.out.println("Represent Thursday");
				break;
			
			case 6:
				System.out.println("Represent Friday");
				break;
			
			case 7:
				System.out.println("Represent Satday");
				break;
			
			default:
				System.out.println("Invalid input");
		}
		
	}

}
