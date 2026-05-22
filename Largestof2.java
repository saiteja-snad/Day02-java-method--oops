package day02Methods;
import java.util.*;
public class Largestof2 {

	public static void lar(int a, int b) {
		if(a>b) {
			System.out.print(a);
		}
		else {
			System.out.print(b);
		}
	}
	
	void larg(int a, int b) {
		if(a>b) {
			System.out.print(a);
		}
		else {
			System.out.print(b);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Largestof2 obj=new Largestof2();
		lar(sc.nextInt(),sc.nextInt());
		obj.larg(sc.nextInt(), sc.nextInt());
		sc.close();
		
	}
}
