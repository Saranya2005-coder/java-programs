Day4primenum.java
  package day4;
import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
        if(num==0 || num==1)
        {
        	System.out.println("not prime");
        }
        else
        {
        	for(int i=2;i<=num;i++)
        	{
        		if(num%i==0)
        		{
        			count++;
        		}
        	}
        	if(count==1)
        	{
        		System.out.println("prime");
        	}
        	else
        	{
        		System.out.println("not prime");
        	}
        }		
	}
}
