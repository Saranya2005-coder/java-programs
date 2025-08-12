reversestring.java
  package Day7;
import java.lang.String;
public class Revstring {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello World");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		StringBuffer word[]= sb.split("Hello World");
		for(String var:word)
		{
			System.out.println(var);
		}	
	}
}
