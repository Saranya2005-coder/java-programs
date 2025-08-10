Day3weight.java
  package Day3;
import java.util.Scanner;
public class task3{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the weight");
    int num = sc.nextInt();
    if(num>=0 && num<=100)
    {
    if(num%2==0) 
    {
    	System.out.println("YES");
    	System.out.println(num/2 + " " + num/2);
    }
    else
    {
    	System.out.println("NO");
    }
    }
    }
}
