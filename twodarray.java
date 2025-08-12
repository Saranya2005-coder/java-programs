twodarray.java
  package Day6;
import java.util.Scanner;
public class TwoDarray {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int arr[][] = {{1,2,3},{2,8,9},{8,6,1}};
		 for(int i=0;i<arr.length;i++)
		 {
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
