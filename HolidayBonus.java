
public class HolidayBonus extends Object{
	
	
	
	public HolidayBonus() {}

	
	
	public static double[]	calculateHolidayBonus(double[][] data, double high, double low, double other) {
		
		double bonus[] = new double[data.length];	
		
		for (int i = 0; i < data.length; i++) {
			
			for (int j = 0; j < data[i].length; j++) {
				
				if (data[i][j] > 0) {
					if (data[i][j] == TwoDimRaggedArrayUtility.getHighestInColumn(data, j)) {
						bonus[i] += high;
					} else if (data[i][j] == TwoDimRaggedArrayUtility.getLowestInColumn(data, j)) {
						bonus[i] += low;
					} else {
						bonus[i] += other;
					}
				}
				
			}
			
		}
		
		return bonus;
	}
	
	
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {
		
		double total = 0;
		
		double [] bonuses = calculateHolidayBonus(data, high, low, other);
		
		for (int i=0; i < bonuses.length; i++)
			total += bonuses[i];
		
		return total;
	}
}
