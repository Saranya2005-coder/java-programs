Day3switchcase.java
  package Day3;
import java.util.Scanner;
public class statement {
    Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
    int num=8;
    switch(num)
    {
    case 0:
    {
    	System.out.println("Monday");
    }
    case 1:
    {
    	System.out.println("Tuesday");
    }
    case 2:
    {
    	System.out.println("Wednesday");
    }
    case 3:
    {
    	System.out.println("Thursday");
    }
    case 4:
    {
    	System.out.println("Friday");
    	break;
    }
    default:
    case 5:
    {
    	System.out.println("saturday");
    }
    case 6:
    {
        System.out.println("sunday");
    }
    case 7:
    {
    	System.out.println("nothing");
    }
    
	}
	}
}
