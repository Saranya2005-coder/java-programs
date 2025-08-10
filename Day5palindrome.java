Day5palindrome.java
  package day5;
import java.util.Scanner;
public class Palindrome1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev = 0;
		while(num>0)
		{
			int temp1 = num %10;
			rev= rev * 10 + temp1;
			num = num/10;
		}
		if(temp1==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
