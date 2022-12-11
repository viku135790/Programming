package Method;
//WAP TO PRINT THE NO B/W 1 TO 20 WHICH IS DIVISIBLE BY 2 AND 4.

import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class dvsbl {
	public static void main(String[] args) {
		System.out.println("These are the numbers which is divisible by 2 and 4 both");
		for(int i=1; i<=20; i++) {
			dsb(i);
		}
	}

	public static void dsb(int i) {
		
		if(i%2==0 && i%4==0) {
			System.out.println(i);
		}
	}


}
