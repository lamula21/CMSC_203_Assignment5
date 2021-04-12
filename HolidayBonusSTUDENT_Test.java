import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HolidayBonusSTUDENT_Test {

	private double[][] dataSetSTUDENT1 = {{10,20,30},{40,50},{60,70,80}};
	private double[][] dataSetSTUDENT2 = {{70,20,90,40},{50},{80,10,30},{110,60,70,20}};
	private double[][] dataSetSTUDENT3 = {{70.2,20.5,90.3,40.8},{50.9},{80.1,10.7,30.3},{110.6,60.9,70.3,20.7}};
	private double[][] dataSetSTUDENT4 = {{-20.5,-50.3,60.1},{-40.4,80.2},{20.3,-70.5},{-40.2,70.3,-50.9,20.6}};

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
		/**
		 * Test calculateHolidayBonus method with a high of 5000, low of 1000 and 2000 as other
		 */

		@Test
		public void testCalculateHolidayBonusA() {
			try{
			double[] result = HolidayBonus.calculateHolidayBonus(dataSetSTUDENT1,5000,1000,2000);
			assertEquals(3000.0,result[0],.001);
			assertEquals(4000.0,result[1],.001);
			assertEquals(15000.0,result[2],.001);
			
			result = HolidayBonus.calculateHolidayBonus(dataSetSTUDENT2,5000,1000,2000);
			assertEquals(14000.0,result[0],.001);
			assertEquals(1000.0,result[1],.001);
			assertEquals(4000.0,result[2],.001);
			assertEquals(13000.0,result[3],.001);
			
			result = HolidayBonus.calculateHolidayBonus(dataSetSTUDENT3,5000,1000,2000);
			assertEquals(14000.0,result[0],.001);
			assertEquals(1000.0,result[1],.001);
			assertEquals(4000.0,result[2],.001);
			assertEquals(13000.0,result[3],.001);
			
			result = HolidayBonus.calculateHolidayBonus(dataSetSTUDENT4,5000,1000,2000);
			assertEquals(5000.0,result[0],.001);
			assertEquals(5000.0,result[1],.001);
			assertEquals(5000.0,result[2],.001);
			assertEquals(7000.0,result[3],.001);
			}
			catch (Exception e) {
				fail("This should not have caused an Exception");
			} 
			
		}
		

		/**
		 * Test calculateHolidayBonus method with a high of 1000, low of 250 and 500 as other
		 */

		@Test
		public void testCalculateHolidayBonusB() {
			try{
			double[] result = HolidayBonus.calculateHolidayBonus(dataSetSTUDENT1,1000,250,500);
			assertEquals(750.0,result[0],.001);
			assertEquals(1000.0,result[1],.001);
			assertEquals(3000.0,result[2],.001);
			
			result = HolidayBonus.calculateHolidayBonus(dataSetSTUDENT2,1000,250,500);
			assertEquals(3000.0,result[0],.001);
			assertEquals(250.0,result[1],.001);
			assertEquals(1000.0,result[2],.001);
			assertEquals(2750.0,result[3],.001);
			
			result = HolidayBonus.calculateHolidayBonus(dataSetSTUDENT3,1000,250,500);
			assertEquals(3000.0,result[0],.001);
			assertEquals(250.0,result[1],.001);
			assertEquals(1000.0,result[2],.001);
			assertEquals(2750.0,result[3],.001);
			
			result = HolidayBonus.calculateHolidayBonus(dataSetSTUDENT4,1000,250,500);
			assertEquals(1000.0,result[0],.001);
			assertEquals(1000.0,result[1],.001);
			assertEquals(1000.0,result[2],.001);
			assertEquals(1500.0,result[3],.001);
			}
			catch (Exception e) {
				fail("This should not have caused an Exception");
			} 
			
		}

		/**
		 * Test calculateTotalHolidayBonus method with a high of 5000, low of 1000 and 2000 as other
		 */
	@Test
	public void testCalculateTotalHolidayBonusA() {
		assertEquals(22000.0,HolidayBonus.calculateTotalHolidayBonus(dataSetSTUDENT1, 5000, 1000, 2000),.001);
		assertEquals(32000.0,HolidayBonus.calculateTotalHolidayBonus(dataSetSTUDENT2, 5000, 1000, 2000),.001);
		assertEquals(32000.0,HolidayBonus.calculateTotalHolidayBonus(dataSetSTUDENT3, 5000, 1000, 2000),.001);
		assertEquals(22000.0,HolidayBonus.calculateTotalHolidayBonus(dataSetSTUDENT4, 5000, 1000, 2000),.001);

	}
	
	/** 
	 * Test calculateTotalHolidayBonus method with a high of 1000, low of 250 and 500 as other
	 */
	@Test
	public void testCalculateTotalHolidayBonusB() {
		assertEquals(4750.0,HolidayBonus.calculateTotalHolidayBonus(dataSetSTUDENT1, 1000,250,500),.001);
		assertEquals(7000.0,HolidayBonus.calculateTotalHolidayBonus(dataSetSTUDENT2, 1000,250,500),.001);
		assertEquals(7000.0,HolidayBonus.calculateTotalHolidayBonus(dataSetSTUDENT3, 1000,250,500),.001);
		assertEquals(4500.0,HolidayBonus.calculateTotalHolidayBonus(dataSetSTUDENT4, 1000,250,500),.001);

	}

}

