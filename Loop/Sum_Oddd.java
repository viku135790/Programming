package Loop;
//WAP TO PRINT SUM OF ODD NO B/W 35 TO 11.
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Sum_Oddd {
	public static void main(String[] args) {
		int sum=0;
		for(int i=35; i>=11; i--) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		System.out.println("The sum of odd number b/w 35 to 11 = "+sum);
	}

}
