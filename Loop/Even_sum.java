package Loop;
//WAP TO CALCULATE SUM OF EVEN NO B/W 1 TO 10
import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Even_sum {
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
