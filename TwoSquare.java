
public class TwoSquare {
	public static void main(String[] args) {
		int[][] abc =new int[10][2];
		for( int i=0;i<10;i++) {
			for(int j=0;j<2;j++) {
				abc[i][0]=i+1;
				abc[i][1]=abc[i][0]*abc[i][0];
				System.out.print(abc[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
