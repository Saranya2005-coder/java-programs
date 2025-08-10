Day3fizzbizz.java
  package Day3;
import java.util.Scanner;
public class fizz {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number");
    int num=sc.nextInt();
    if(num%3==0 && num%5==0)
    {
    	System.out.println("Fizzbizz");
    }
    else if(num %5==0)
    {
    	System.out.println("bizz");
    }
    else if(num %3==0)
    {
    	System.out.println("Fizz");
    }
	}
}
