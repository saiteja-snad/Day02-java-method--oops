package day02Methods;
import java.util.*;

public class methodOverloading {
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static String add(String a, String b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  2 no  ");
		add(sc.nextInt(),sc.nextInt());
		System.out.println("enter the  3 no  ");
		System.out.println(add(sc.nextInt(),sc.nextInt(),sc.nextInt()));
	     sc.nextLine();
		System.out.println("enter the  2  string to concat ");
		System.out.println(add(sc.nextLine(),sc.nextLine()));
		sc.close();
	}

}
