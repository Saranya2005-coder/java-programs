Spreadoperator.java
  package Day10;
public class Spreadopt 
{
	public static void add(int ...m)
	{
		for(int n:m)
		{
			System.out.println(n);
		}	
	}
	public static void main(String[] args) 
	{
		add(10);
		add(10,20);
		add(10,20,30);		
	}
}
