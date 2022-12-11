package Method;
//WAP TO PRINT THE NO B/W 1 TO 30 WHICH IS DIVISIBLE BY 3 AND 9.

/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Divisible {
	public static void main(String[] args) {
		System.out.println("These are the numbers which is divisible by 3 and 9 both");
		for(int i=1; i<=30; i++) {
			dsb(i);
		}
	}

	public static void dsb(int i) {
		
		if(i%3==0 && i%9==0) {
			System.out.println(i);
		}
	}

}
