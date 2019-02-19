package HW4.Problem9;

public class needle {
	public static void main(String[] srgs)
	{
		double ylow;
		double yhigh;
		double iangle;
		
		int iHit = 0;
		
		for(int m = 1;m<=10000;m++)
		{
			ylow = Math.random() * 2;
			
			iangle = Math.random() * 180;
			
			yhigh = ylow + Math.sin(iangle);
			
			if(yhigh>=2)
				iHit++;
			
		}
		System.out.println("# of tries/# of hits: " + 10000/iHit);
	}
	

}
