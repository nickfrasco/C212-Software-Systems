
public class carTester {

	public static void main(String[] args) {
		car myHybrid = new car(50); //50 miles per gallon
		myHybrid.addGas(20);
		myHybrid.drive(50); // use gallon
		myHybrid.addGas(10); //add gas
		myHybrid.drive(50); // drives more 
		
		double gasLeft = myHybrid.getGasInTank();
		System.out.print("Gas left: " + gasLeft);
		System.out.print("Miles Driven: " + myHybrid.getMilesDriven());
		

	}

}
