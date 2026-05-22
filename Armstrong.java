package day02Methods;
import java.util.*;
public class Armstrong {
	public static boolean ams(int n) {
		int m=n;
		int d=pow(n);
		
		int k=0;
		while(n>0) {
		int g=n%10;
		    k+=(int)Math.pow(g, d);
			n=n/10;
		}
		
		return m==k;
	}
	
	public static int pow(int n) {
		int c=0;
		while(n>0) {
			int g=n%10;
			c++;
			n=n/10;
		}
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(ams(sc.nextInt()));
		sc.close();

	}

}
