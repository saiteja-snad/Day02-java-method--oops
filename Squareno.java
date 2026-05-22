package day02Methods;
import java.util.*;
public class Squareno {
	public static int squareOf(int n) {
		int c=n*n;
		return c;
	}
	
	int squareOfn(int n) {
		int g=n*n;
		return g;
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(squareOf(sc.nextInt()));
	Squareno obj=new Squareno();
	System.out.println(obj.squareOfn(sc.nextInt()));
	sc.close();
	
}
}
