package day02Methods;
import java.util.*;
public class Rev {
	
	public static int count(int n) {
		int d=0;
		while(n>0) {
			int g=n%10;
			d++;
			n=n/10;
		}
		return d;
	}
	
	
	public static int sum(int n) {
		int s=0;
		while(n>0) {
			int g=n%10;
			s=s+g;
			n=n/10;
		}
		return s;
	}
	
	
	public static int rev(int n) {
		int m=n;
		int g=0;
		while(n>0) {
			g=g*10+n%10;
			n=n/10;
		}
		return g;
	}
	
	
	public static String prime(int n) {
		int f=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				f++;
			}
		}
		if(f==2) {
			return "prime";
	}
		return "not prime";
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no for reverse");
		System.out.println(rev(sc.nextInt()));
		System.out.println("enter a no for sum of the digits");
		System.out.println(sum(sc.nextInt()));
		System.out.println("enter a no for count no of digits");
		System.out.println(count(sc.nextInt()));
		System.out.println("enter a no for check prime or not");
		System.out.println(prime(sc.nextInt()));
		sc.close();

	}

}
