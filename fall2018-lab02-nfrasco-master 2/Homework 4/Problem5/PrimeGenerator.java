package HW4.Problem5;

public class PrimeGenerator {
	int number;
	public PrimeGenerator()
	{
		number = 1;
	}
	public int nextPrime()
	{
		number++;
		while(!isPrime(number))
		{
			number++;
		}
		return number;
	}
	public static boolean isPrime(int a)
	{
		boolean flag = false;
		int no = 1;
		for(int c = 2;c<=a;c++) 
		{
			if (a%c == 0)
				no++;
		}
		if (no==2)
			flag = true;
		return flag;
	}
}
