import java.util.Scanner;

class MagicSquare {
	public static boolean check(int[][] item)
	{
		final int len = item.length;
		int R_sum = 0, C_sum = 0;
		int prim_dig_sum = 0, sec_dig_sum = 0;
		boolean[] flag = new boolean[len*len];
		for (int r = 0; r<len; r ++)
				{
			R_sum = 0;
			C_sum = 0;
			for (int c = 0; c<len; c++)
			{
				if (item[r][c] < 1 || item[r][c] > 16)
					return false;
				if (flag[item[r][c]-1] == true)
					return false;
						
				flag[item[r][c]-1] = true;
				R_sum += item[r][c];
				C_sum += item[c][r];
						}
			prim_dig_sum += item[r][r];
			sec_dig_sum += item[r][len-r-1];
					
			if (R_sum != C_sum)
					return false;
				}
		
		if (prim_dig_sum != sec_dig_sum)
			return false;
		return true;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Please enter 16 numbers:");
		Scanner input = new Scanner(System.in);
		int[][] Matrix = new int[4][4];
		for (int i = 0; i<4; i++)
		{
			for (int j = 0; j<4; j++)
			{
				Matrix[i][j] = input.nextInt();
				
			}
		}
		
		//input.closed()
		if(check(Matrix))
			System.out.println("\nNumbers entered do form a Magic square Matrix");
		else
			System.out.println("\nNumbers entered don't form a Magic square Matrix");
	}
		
	}
