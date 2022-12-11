package Loop;
//WAP TO PRINT SUM OF EVEN NO B/W 20 TO 10
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Summ_Even {
	public static void main(String[] args) {
		int sum=0;
		for(int i=20; i>=10; i--) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("The sum of even number b/w 20 to 10 = "+sum);
	}

}
