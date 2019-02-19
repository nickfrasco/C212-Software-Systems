package HW4.Problem2;

public class DataSet {
	private double totalSum;
	private double totalSquareSum;
	private double smallest;
	private double largest;
	private double count;
	
	{
	totalSum = 0;
	smallest = Double.MAX_VALUE;
	largest = Double.MIN_VALUE;
	count = 0;	
	}
	
	public void add(double value)
	{
		double num = value;
		totalSum += num;
		totalSquareSum += Math.pow(num, 2.0);
		count++;
		
		if(value>smallest)
		smallest = value;
		if(value>largest)
		largest = value;
		
	}
	
	public double getAverage()
	{
		return totalSum/count;
		
	}
	public double getStandardDeviation() {
		double stddev = 0;
		stddev = Math.sqrt((totalSquareSum-(1.0/count)*Math.pow(totalSum, 2.0))/(count-1));
		return stddev;
		
	}
}

