package javab;

public class ReverseNum {
	public static void main(String[] args) {
		int n=9286,num=0;
		while(n!=0) {
			int rem=n%10;
			num=num*10+rem;
			n=n/10;
		}
		System.out.println(num);
	}

}
