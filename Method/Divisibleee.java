package Method;
//WAP TO PRINT THE NO B/W 1 TO 100 WHICH IS DIVISIBLE BY ONLY 9.

/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Divisibleee {
	public static void main(String[] args) {
		System.out.println("These are the numbers which is divisible by 9 ");
		for(int i=1; i<=100; i++) {
			dsb(i);
		}
	}

	public static void dsb(int i) {
		
		if(i%9==0) {
			System.out.println(i);
		}
	}

}
