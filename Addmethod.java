package day02Methods;

public class Addmethod {
	public static int addto(int a, int b) {
		return a+b;
	}
	int addthree(int a, int b, int c) {
		return a+b+c;
	}
public static void main(String[] args) {
	System.out.println(addto(5,6));
	Addmethod obj=new Addmethod();
	System.out.println(obj.addthree(2, 5, 3));
}
}
