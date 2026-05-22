package OPPS;

public class Objectcreation {

	static  int a=10;
	static String s="sai";
	boolean b=true;
	float f=12.9f;
	 
	Objectcreation(){
		
	}
	  public Objectcreation(int a, String s) {
		 this.a=a;
		 this.s=s;
	 }
	  public static  void Add(int a, int c) {
		  System.out.println(a+c);
	  }
	  void even(int n) {
		  if(n%2==0) {
			  System.out.print("even");
		  }
	  }
	}
	 class B{
		public static void main(String[] args) {
			
			System.out.println(Objectcreation.a);
			Objectcreation obj=new Objectcreation();
		System.out.println(obj.b);
			System.out.println(obj.f);
		}
	}

