
public class car {
	private double fuelLevel;
	private double gasinGallons;
	private double MilesDriven;
	private double fuelEffiency;
	
	public car(double anEfficiency)
	{
		fuelEffiency = anEfficiency;
		fuelLevel = 0;
		MilesDriven = 0;
		
	}
	
	public void addGas(double amount)
	{
		fuelLevel = fuelLevel + amount;
	}
	
	public void drive(double distance)
	{
		gasinGallons = distance/fuelEffiency;
		fuelLevel = fuelLevel - gasinGallons;
		MilesDriven = MilesDriven + distance;
	}
	
	public double getGasInTank() {
		return fuelLevel;
	}
	public double getMilesDriven() {
		return MilesDriven;
	}

}
