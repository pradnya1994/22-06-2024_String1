package arguments;

/**
 * Write a java program to calculate simple interest for given amount,
 * rate of interest and time duration.
 * 
 * Note: read the values/input values of program from command-line.
 */
public class SimpleInterest {
	
	
	public static void main(String[] args) 
	{
		
		double simpleInterst = 0.0;
		
		double amount;
		float ROI;
		int timePeriod;
		
		amount = Double.parseDouble(args[0]);
		ROI = Float.parseFloat(args[1]);
		timePeriod = Integer.parseInt(args[2]);
		
		simpleInterst = (amount*ROI*timePeriod)/100;
		
		System.out.println(simpleInterst);
		
		
	}

}
