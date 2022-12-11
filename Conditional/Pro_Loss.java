package Conditional;
//Find Profit and loss percentage
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Pro_Loss {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cost price :- ");
		double cp=sc.nextDouble();
		System.out.println("Enter the selling price :- ");
		double sp=sc.nextDouble();
		
		if(sp>cp) {
			double profit=(sp-cp);
			System.out.println("Profit is "+profit);
			double proper=(profit*100)/cp;
			System.out.println("Profit percentage is "+proper+" %");
		}
		else if(cp>sp) {
			double loss=(cp-sp);
			System.out.println("Profit is "+loss);
			double lossper=(loss*100)/sp;
			System.out.println("Profit percentage is "+lossper+" %");
		}
		else {
			System.out.println("Neither profit neither loss");
		}
	}

}
