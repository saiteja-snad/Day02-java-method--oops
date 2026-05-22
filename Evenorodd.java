package day02Methods;

import java.util.Scanner;

public class Evenorodd {
	
	public static String evenOrodd(int n) {
		if(n%2==0) {
			return "even";
		}
		return "odd";
		}
	
	
	public  String evenOrodd1(int n) {
		if(n%2==0) {
			return "even";
		}
		return "odd";
		}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Evenorodd obj=new Evenorodd();
		System.out.println(evenOrodd(sc.nextInt()));
		System.out.println(obj.evenOrodd1(sc.nextInt()));
		sc.close();

	}

}
