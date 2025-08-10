Day3marksforgrade.java
  package Day3;
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your number");
    int num=sc.nextInt();
    if(num>=90 && num<=100)
    {
    	System.out.println("the grade is A+");
    }
    else if(num>=80 && num<=89)
    {
    	System.out.println("the grade is A");
    }
    else if(num>=70 && num<=79)
    {
    	System.out.println("the grade is B");
    }
    else if(num>=60 && num<=69)
    {
    	System.out.println("the grade is C");
    }
    else if(num>=50 && num<=59)
    {
    	System.out.println("the grade is D");
    }
    else if(num<=50)
    {
    	System.out.println("fail");
    }
	}
}
