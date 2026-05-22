package OPPS;

import java.util.Scanner;

public class Encap {
	private int id;
	 private String name;
	 private String cource;
	 private double fee;
	
	 Encap(int id, String name, String cource, double fee){
		 this.id=id;
		 this.name=name;
		 this.cource=cource;
		 this.fee=fee;
	 }
	 
	 public int getId() {
		 return id;
	 }
	 public void setid(int a) {
		 this.id=a;
	 }
	 public String getname() {
		 return name;
	 }
	 public void setname(String name) {
		 this.name=name;
	 }
	 public String getc() {
		 return cource;
	 }
	 public void setc(String c) {
		 this.cource=c;
	 }
	 public double getf() {
		 return fee;
	 }
	 public void setf(double d) {
		 this.fee=d;
	 }
	 public String toString() {
		 return" Encap[id="+id+",name="+name+",cource="+cource+",fee="+fee+"]";
}
class Student{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Encap obj=new Encap(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
		obj.setid(sc.nextInt());
		obj.setname(sc.next());
		obj.setc(sc.next());
		obj.setf(sc.nextDouble());
//		
//		System.out.print(obj.getId());
//		System.out.print(obj.getname());
//		System.out.print(obj.getc());
//		System.out.print(obj.getf());
		
		System.out.println(obj);
		sc.close();
	
			
		}
		
	}
}
