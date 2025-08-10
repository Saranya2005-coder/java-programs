Day4fibonacciseries.java
  package day4;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int num = sc.nextInt();  
		        int fib1 = 0;
		        int fib2 = 1;
		        int i = 1;
		        System.out.print("Fibonacci Series: ");
		        while(i <= num) {
		            System.out.print(fib1 + " ");
		            int next = fib1 + fib2;
		            fib1 = fib2;
		            fib2 = next;
		            i++;
		        }  
		    }  	 
}
