Day3eligibleforvote.java
  package Day3;
import java.util.Scanner;
public class age {
	public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter your age");
    int age=sc.nextInt();
    if(age>=18)
    {
    	System.out.println("eligible for vote");
    }
    if(age>=24)
    {
    	System.out.println("eligible for candidate");
    }
    else
    	{
    	System.out.println("not eligible");	
    	}
    }
	}
