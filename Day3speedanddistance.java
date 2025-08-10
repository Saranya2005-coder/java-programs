Day3speedanddistance.java
  package Day3;
import java.util.Scanner;
public class speed {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int dis=sc.nextInt();
        int speed=sc.nextInt();
        Float conf=sc.nextFloat();
        Float cur=sc.nextFloat();
        int time=dis/speed;
        Float temp=cur+time;
        if(conf>=cur)
        {
            if(conf>=temp)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        else
        {
            System.out.println("Invalid input");
        }     
    }	

}
