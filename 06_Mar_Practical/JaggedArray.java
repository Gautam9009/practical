package march_06;
// odd number of column know as a jagged array
public class JaggedArray {
	public static void main(String[] args) {
		// declare 2d array
		// declare no of row = 3 but column _____ (blank)
		int arr[][] = new int[3][];
		// defining column 4+7+10=21
		arr[0] = new int [4];
		arr[1] = new int[7];
		arr[2] = new int[10];
		// initialized the jagged array
		int count = 0;
		for(int i = 0; i<arr.length;i++)  // row
		for(int j=0;j<arr[i].length;j++)  // column
			arr[i][j]=count++;
		// print the jagged array
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}