import java.util.Scanner;

public class ElementPair {
	class ElementsPair
	{
	 static void disp(int x[],int n)
	 {
	
	for(int i=0;i<x.length;i++)
	{
	for(int j=0;j<x.length;j++)
	{
	if(i!=j)
	{
	if(x[i]+x[j]==n)
	{
	System.out.println(x[i]+" "+x[j]);
	  }
	 }
	}
   }
}
	 public static void main(String args[])
	 {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elelments");
	int n = sc.nextInt();
	int ar[] = new int[n];
	System.out.println("Enter the numbers");
	for(int i = 0;i<n;i++)
	ar[i] = sc.nextInt();
	System.out.println("Enter the element to print greater than that element");
	
	int i = sc.nextInt();
	disp(ar,i);
	 }	

}
