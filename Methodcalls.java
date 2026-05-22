package day02Methods;

import java.util.Scanner;

public class Methodcalls {
public static void manager() {
	System.out.println("manager :  calling teamlead");
	teamlead1();
	
}
public static void teamlead1() {
	System.out.println("teamleader:  project completed");
		
}
public static void teamlead() {
	System.out.println("teamlead : calling to pavan");
	pavan();	
}
public static void pavan() {
	System.out.println("pavan : calling to traines");
	prasad();
	sai();
	anuradha();
}

public static void prasad() {
	System.out.println("prasad : working on arrays and strings");
	
}
public static void sai() {
	System.out.println("sai : working on collections");
}

public static void anuradha() {
	System.out.println("anuradha : working on string and collections");
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" 1 for project"+"  2 for traine"+"  3 for traine task");
	int s=sc.nextInt();
	switch(s) {
	case 1:
		manager();
		break;
	
	case 2:
		teamlead();
		break;
		
	case 3:
		pavan();
		break;
	}
	sc.close();
	
}
}
