sumofdigit.java
  package Day7;
import java.util.Scanner;
public class Sumofdigit1 
{
		public int add(int a,int b)
		{
			int sum = a+b;
			return sum;
		}
		public static void main(String[] args)
		{
			Sumofdigit1 obj = new Sumofdigit1();
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int num2 = sc.nextInt();
			int res = obj.add(num, num2);
			System.out.println(res);
		}

}
