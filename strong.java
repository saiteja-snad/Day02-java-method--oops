package day02Methods;
import java.util.*;
public class strong {
	public static boolean  digit(int n) {

        int temp = n;
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            sum = sum + fact(digit);

            n = n / 10;
        }

        return temp == sum;
	}
	
	public static int fact(int n) {
		 int fact = 1;

	        for (int i = 1; i <= n; i++) {
	            fact = fact * i;
	        }

	        return fact;
	}
	
   
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(digit(sc.nextInt()));
	sc.close();

	}

}
