package day02Methods;
import java.util.*;
public class Fact {
	public static void factors(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
			
		}
		
	}
	void fact(int n) {
		int g=1;
		for(int i=1;i<=n;i++) {
			g=g*i;
		}
		System.out.println(g);
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Fact obj=new Fact();
	factors(sc.nextInt());
	obj.fact(sc.nextInt());
	sc.close();

	}

}
