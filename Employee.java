package OPPS;

import java.util.Scanner;

public class Employee {
   private int id;
   private String name;
   private double salary;
   
   
   public Employee(int id, String name, double salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;
}


   public String toString() {
    	return "Employee[id="+id+",name="+name+",salary="+salary+"]";
    }
   
}
class E{
	public static void main(String[] args) {
		
	Employee obj=new Employee(12,"sai",20020);
	Employee obj1=new Employee(13,"refd",20020);
	System.out.println(obj);
	System.out.println(obj1);
}
}