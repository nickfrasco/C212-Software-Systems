import java.util.Scanner;

public class OddMagicSquare {
	public static void main(String[] args) {
		System.out.println("Enter size of the magic square: ");
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		System.out.println("Size of n: " + n);
		int[][] arr = magicSquare(n);
		
		for (int i=0; 
		{
			for(int j=0 ; j
			{
				System.out.print(" " + arr[i][j]);
			}
			System.out.println("");
		}
	}
	public static int[][] magicSquare(final int n)
	{
		int[][] arr = new int[n][n];
		if(n%2 ==0)
		{
			System.out.println("Incorrect value of n");
			System.exit(0);
		}
		
		int row = n-1;
		int column = n/2;
		int rowTemp = 0;
		int columnTemp = 0;
		for(int k = 1;k<=n*n;k++)
		{
			rowTemp = row;
			columnTemp = column;
			arr[row][column] = k;
			
			row++;
			column++;
			
			if(row == n)
			{
				row = 0;
			}
			if (column == n)
			{
				column = 0;
			}
			if(arr[row][column]!=0)
			{
				row = rowTemp;
				column = columnTemp;
				row = row - 1;
				
			}
		}
	
	return arr;
	
	}
}
