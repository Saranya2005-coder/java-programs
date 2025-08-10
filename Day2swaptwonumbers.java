Day2swaptwonumbers.java
  package college;
import java.util.Scanner;
public class swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    int a = 10;
	        int b = 20;
	        System.out.println("Before swapping: a="+ a + ", b = " + b);
	        int temp = a;
	        a = b;        
	        b = temp;    
	        System.out.println("After swapping: a = " + a + ", b = " + b);
	}
}
