package OPPS;

import java.util.Scanner;

public class Bank {
private double balance;

Bank(double balance){
	this.balance=balance;
}


public void deposite(double amount) {
	balance=balance+amount;
	System.out.println(balance);
}
public double withdraw(double amount) {
	if(balance<amount) {
		System.out.println("no money in our account");
	}
	return balance=balance-amount;
}
public double getbalance() {
	return balance;
}
}

class D{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
	Bank obj=new Bank(10000);
	System.out.println("choose the option 1 for deposite  2 for withdraw  3 for getbalance");
	int n=sc.nextInt();
	if(n==1) {
		System.out.println(" amount  to add");
	    obj.deposite(sc.nextDouble());
	}
	else if(n==2) {
    System.out.println(" amount  to withdraw");
    System.out.println(obj.withdraw(sc.nextDouble()));
	}
	else if(n==3) {
    System.out.println(" remaining balance");
    System.out.println(obj.getbalance());
	}
	else {
		System.out.println("choose correct option");
	}
	}	
}