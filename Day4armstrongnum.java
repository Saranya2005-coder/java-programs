Day4armstrongnum.java
  package day4;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int armstr = 0;
		int original = num;
		while(num>0)
		{
			int temp = num%10;
			armstr = armstr + (temp *temp *temp);
			num = num/10;
		}
		if(armstr == original)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not armstrong number");
		}
	}
}
