Methodoverloading.java
  package Day10;
public class Inheritance 
{
	public static int add(int a, int b)
	{
		return a+b;
	}
	public static int add(int a, int b, int c)
	{
		return a+b+c;
	}
	public static double add(double a, double b)
	{
		return a+b;
	}
	public static void main(String[] args) 
	{
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
		System.out.println(add(10.0,20.0));
	}
}
