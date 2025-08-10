Unaryoperators.java
  package Day1;
import java.util.Scanner;
public class Postincrement {
	public static void main(String[] args) {
		        int a = 8;
		        int b = 9;
		        System.out.println(a++ + b++); 
		        System.out.println(--b + a++); 
		        System.out.println(a-- + b++);
		        System.out.println(--b + ++a); 
		        System.out.println(b);         
		        System.out.println(a--);       
		        System.out.println(--b + a);   
	}
}
