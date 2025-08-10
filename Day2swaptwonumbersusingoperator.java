Day2swaptwonumbersusingoperator.java
  package college;
import java.util.Scanner;
public class swapopt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 10;
		int b = 20;
		System.out.println("Before swapping: a = " + a + ", b = " + b);
		a = a + b; 
		b = a - b;
		a = a - b; 
		System.out.println("After swapping: a = " + a + ", b = " + b);
	}
}
