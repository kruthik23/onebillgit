import java.util.Scanner;

public class IncreaseDecrease {
public static void main(String[] args) {
	double num1;
	double num2;
	double num3;
 Scanner input =new Scanner(System.in);
 System.out.println("enter the first number: ");
 num1 = input.nextDouble();
 System.out.println("enter the second number :");
 num2 = input.nextDouble();
 System.out.println("enter the third number:");
 num3 = input.nextDouble();
 System.out.println((num1>num2==true) && (num2>num3 == true)? 
		 "decreasing":(num1<num2==true)&&(num2<num3==true)? "increasing":"neither");
 
}
	
}
