import java.util.Scanner;

public class SmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
Scanner sc = new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if((a<b)&&(a<c))
 System.out.println("a is small");
else if(b<c)
	System.out.println("b is small");
else System.out.println("c is small");
	
	}

}
