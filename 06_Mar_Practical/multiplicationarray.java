package march_06;

public class multiplicationarray {
public static void main(String[] args) {
	// create matrix
		int a[][] = {{1,2,3},{1,2,3},{1,2,3}};
		int b[][] = {{4,5,6},{4,5,6},{4,5,6}};
		int c[][] = {{7,8,9},{7,8,9},{7,8,9}};
		//for storing result creating another matrix
		int x[][] = new int [3][3];
		// logic and printing
		for(int i=0; i<3;i++) {  // printing row
			for(int j=0; j<3;j++) {  //// printing column
				// multiplication
					x[i][j]=a[i][j]*b[i][j]*c[i][j];
					System.out.print(x[i][j]+" ");
				}
				System.out.println();
			}
		}

}
