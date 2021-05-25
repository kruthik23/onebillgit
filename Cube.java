import java.util.Scanner;

public class Cube {
public static void main(String[] args) {
		int i,n;
		System.out.println("Input number:");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		for(i=1;i<=n;i++)
		{
			int result = i*i*i;
			System.out.println(result);
		}
}
}
