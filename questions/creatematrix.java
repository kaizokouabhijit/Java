package questions;

// create matrix and multiply matrix both in this

public class creatematrix {
	
	public static void main(String[] args)
	{
		int size = 4;
		
		int row1 = 4, col1 = 4, row2 = 4, col2 = 4;

		int A[][] = { { 1, 1, 1, 1 },
					{ 2, 2, 2, 2 },
					{ 3, 3, 3, 3 },
					{ 4, 4, 4, 4 } };
		System.out.println("Matrix A:");
		printMatrix(A, size, size);

		int B[][] = { { 1, 1, 1, 1 },
					{ 2, 2, 2, 2 },
					{ 3, 3, 3, 3 },
					{ 4, 4, 4, 4 } };
		System.out.println("\nMatrix B:");
		printMatrix(B, size, size);
		

		int C[][] = add(A, B, size);

		System.out.println("\nResultant Matrix after addition:");
		printMatrix(C, size, size);
		
		multiplyMatrix(row1, col1, A,
				row2, col2, B);
	}
static void printMatrix(int M[][],
								int row,
								int col)
		{
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++)
					System.out.print(M[i][j] + " ");

				System.out.println();
			}
		}

static void multiplyMatrix(
		int row1, int col1, int A[][],
		int row2, int col2, int B[][])
	{
		int i, j, k;

		System.out.println("\nMatrix A:");
		printMatrix(A, row1, col1);
		System.out.println("\nMatrix B:");
		printMatrix(B, row2, col2);

		if (row2 != col1) {

			System.out.println(
				"\nMultiplication Not Possible");
			return;
		}

		int C[][] = new int[row1][col2];

		for (i = 0; i < row1; i++) {
			for (j = 0; j < col2; j++) {
				for (k = 0; k < row2; k++)
					C[i][j] += A[i][k] * B[k][j];
			}
		}

		System.out.println("\nResultant Matrix after multiplication:");
		printMatrix(C, row1, col2);
	}
static int[][] add(int A[][], int B[][],
						int size)
		{
			int i, j;
			int C[][] = new int[size][size];

			for (i = 0; i < size; i++)
				for (j = 0; j < size; j++)
					C[i][j] = A[i][j] + B[i][j];

			return C;
		}

		
	}





