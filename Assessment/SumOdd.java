import java.util.Scanner;

public class SumOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number of terms:");
		int num =sc.nextInt();
		int sum =0;
		for(int i=1 ; i<num ;i++) {
			System.out.println(2*i-1);
			sum = sum + (2*i-1);
		}
		System.out.println("the sum of odd number:"+sum);
	}

}
