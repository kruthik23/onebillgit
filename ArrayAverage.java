
public class ArrayAverage {
public static void main(String[] args) {
	int[] numbers = {1,2,3,4,5,6};
	int sum=0;
	int average;
	for(int number : numbers) {
		sum= sum + number;
	}
	average=sum/numbers.length;
	System.out.println(sum);
	System.out.println(average);
}
}
