package Loop;

public class Keith_Number {
	public static void main(String[] args) {
		int n=742;
		
		int sum=0;
		int last=sum;
		while(n!=0) {
			int r=n%10;
			n=n/10;
			sum=sum+r;
		}
		System.out.println(sum);
		
	}

}
