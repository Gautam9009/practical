package march_06;
// two matrices addition 2*2
public class AdditionalArray {
	public static void main(String[] args) {
		// create matrix
		int a [][] = {{1,2},{3,4}};
		int b [][] = {{1,5},{3,5}};
		//for storing result creating another matrix
		
		int c[][] = new int [2][2];  // two row two column
		// logic and printing
		for(int i = 0;i<2;i++) {  // printing row
			for(int j = 0; j<2;j++) {  // printing column
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
