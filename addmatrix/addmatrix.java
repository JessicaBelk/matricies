import java.util.*;

public class addmatrix {
	public static void main(final String[] args) {
		// add two matricis
		System.out.println("add two matricies");
	
	    
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter row size");
			int m = s.nextInt();
			System.out.println("enter colomn size");
			int n = s.nextInt();

			

			System.out.println("enter values for the first matrix");
			System.out.println("example: if a 2x2, first two numbers are in row 1 and second two are in row 2");

			int matrixdim1[][] = new int[m][n];
			int matrixdim2[][] = new int[m][n];
			int matrixfinal[][] = new int[m][n];
			
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {

					matrixdim1[i][j] = s.nextInt();
				}
			}
			System.out.println("enter values for the second matrix");
			System.out.println("example: if a 2x2, first two numbers are in row 1 and second two are in row 2");

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					matrixdim2[i][j] = s.nextInt();
				}
			}
			System.out.println("first matrix");

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					matrixfinal[i][j] = matrixdim1[i][j] + matrixdim2[i][j];
				}
			}
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(matrixdim1[i][j] + " ");
				}
				System.out.print("");
			}
			System.out.println("second matrix");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(matrixdim2[i][j] + " ");
				}
				System.out.println("");
			}
			System.out.println("matrix sum");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(matrixfinal[i][j] + " ");
				}
				System.out.println("");
			}
		}

	}





	
}
