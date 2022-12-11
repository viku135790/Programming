package Loop;
//WAPT PRINT SUM OF ODD NO B/W 1 TO 10
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Sum_Odd {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		System.out.println("The sum of number b/w 1 to 10 = "+sum);
		
	}

}
