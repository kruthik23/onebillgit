
public class ReverseArray {
	static void reverseArray(int x[])
	{
	int start=0,end=x.length-1;
	while(start<end)
	{
	int t=x[start];
	x[start]=x[end];
	x[end]=t;
	start++;
	end--;
	} }
	public static void main(String []arg)
	{
	int a[] = {25,35,45,55,65};
	System.out.println("before reverse");
	
	for (int i=0;i<a.length;i++)
	{
	System.out.print(a[i] + " ");
	}
	reverseArray(a);
	System.out.println();
	System.out.println("after reverse");
	for(int i=0;i<a.length;i++)
	{
	System.out.print(a[i] + " ");
	} 
	}

}
