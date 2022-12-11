package Loop;
/*WAP TO CALCULATE SUM OF ALL THE NOS WHICH IS PRESENT IN 20 TO 60 AND NO 
 * SHOULD BE DIVISIBLE BY ONLY 11.*/

/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */


public class Dvsbl_Range {
	public static void main(String[] args) {
		int sum=0;
		for(int i=20; i<=60; i++) {
			if(i%11==0) {
				sum=sum+i;
			}
		}
		System.out.println("THE SUM OF ALL THE NOS WHICH IS PRESENT IN 20 TO 60 AND AND DIVISIBLE BY 11 = "+sum);
	}

}
