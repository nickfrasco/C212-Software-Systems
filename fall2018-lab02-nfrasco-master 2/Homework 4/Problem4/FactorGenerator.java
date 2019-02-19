package HW4.Problem4;

public class FactorGenerator {
	private int number;
	public FactorGenerator(int numberToFactor)
	{
		number = numberToFactor;
	}
	
	public boolean hasMoreFactors() {
		return number > 0;
	}
	
	public int nextFactor()
	{
		int factor = 2;
		while (number % factor != 0)
			factor++;
		number = number / factor;
		return factor;
	}
}
