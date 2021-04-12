

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilitySTUDENT_Test {
	//STUDENT fill in dataSetSTUDENT with values, it must be a ragged array
	
	private double[][] dataSetSTUDENT1 = {{200,-50,30},{500,1000},{10,300,5000}};
	private double[][] dataSetSTUDENT2 = {{-10,-200,-80,-455},{500},{800,112,3563},{1113,61,7567,2734}};
	private double[][] dataSetSTUDENT3 = {{-6.5,10.5,8.5},{100.5},{50.5,40.5,4.0},{11.0,14.0,17.0,27.0}};
	private double[][] dataSetSTUDENT4 = {{-25.5,5.0,6.5},{50.0,50.5},{-24.5,75.5},{-42.4,73.5,-59.0,26.9}};
	
	private File inputFile,outputFile;

	@Before
	public void setUp() throws Exception {
		outputFile = new File("studentTest.txt");
	}

	@After
	public void tearDown() throws Exception {
		dataSetSTUDENT1 = dataSetSTUDENT2 = dataSetSTUDENT3 = dataSetSTUDENT4 = null;
		inputFile = outputFile = null;
	}

	/**
	 * Student Test getTotal method
	 * Return the total of all the elements in the two dimensional array
	 */
	@Test
	public void testGetTotal() {
		assertEquals(6990.0,TwoDimRaggedArrayUtility.getTotal(dataSetSTUDENT1),.001);
		assertEquals(15705.0,TwoDimRaggedArrayUtility.getTotal(dataSetSTUDENT2),.001);
		assertEquals(277.0,TwoDimRaggedArrayUtility.getTotal(dataSetSTUDENT3),.001);
		assertEquals(136.5,TwoDimRaggedArrayUtility.getTotal(dataSetSTUDENT4),.001);	
	}

	/**
	 * Student Test getAverage method
	 * Return the average of all the elements in the two dimensional array
	 */
	@Test
	public void testGetAverage() {
		assertEquals(873.75,TwoDimRaggedArrayUtility.getAverage(dataSetSTUDENT1),.001);
		assertEquals(1308.75,TwoDimRaggedArrayUtility.getAverage(dataSetSTUDENT2),.001);
		assertEquals(25.1818,TwoDimRaggedArrayUtility.getAverage(dataSetSTUDENT3),.001);
		assertEquals(12.4090,TwoDimRaggedArrayUtility.getAverage(dataSetSTUDENT4),.001);
	}

	/**
	 * Student Test getRowTotal method
	 * Return the total of all the elements of the row.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		assertEquals(1500.0,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT1,1),.001);
		assertEquals(500.0,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT2,1),.001);
		assertEquals(-745.0,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT2,0),.001);
		assertEquals(69.0,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT3,3),.001);
		assertEquals(100.5,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT3,1),.001);
		assertEquals(100.5,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT4,1),.001);
		assertEquals(-1.0,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT4,3),.001);	
	}


	/**
	 * Student Test getColumnTotal method
	 * Return the total of all the elements in the column. If a row in the two dimensional array
	 * doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * Column 0 refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotal() {
		
		assertEquals(710.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT1,0),.001);
		assertEquals(11050.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT2,2),.001);
		assertEquals(65.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT3,1),.001);
		assertEquals(-42.4,TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT4,0),.001);
		assertEquals(204.5,TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT4,1),.001);
	}


	/**
	 * Student Test getHighestInArray method
	 * Return the largest of all the elements in the two dimensional array.
	 */
	@Test
	public void testGetHighestInArray() {
		
		assertEquals(5000.0,TwoDimRaggedArrayUtility.getHighestInArray(dataSetSTUDENT1),.001);
		assertEquals(7567.0,TwoDimRaggedArrayUtility.getHighestInArray(dataSetSTUDENT2),.001);
		assertEquals(100.5,TwoDimRaggedArrayUtility.getHighestInArray(dataSetSTUDENT3),.001);
		assertEquals(75.5,TwoDimRaggedArrayUtility.getHighestInArray(dataSetSTUDENT4),.001);
	}
	

	/**
	 * Test the writeToFile method
	 * write the array to the outputFile File
	 * then read it back to make sure formatted correctly to read
	 * @throws FileNotFoundException 
	 * 
	 */
	@Test
	public void testWriteToFile() throws FileNotFoundException {
		double[][] array=null;
		try {
			TwoDimRaggedArrayUtility.writeToFile(dataSetSTUDENT4, outputFile);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
		array = TwoDimRaggedArrayUtility.readFile(outputFile);
		assertEquals(-25.5, array[0][0],.001);
		assertEquals(5.0, array[0][1],.001);
		assertEquals(6.5, array[0][2],.001);
		assertEquals(50.0, array[1][0],.001);
		assertEquals(50.5, array[1][1],.001);
		assertEquals(-24.5, array[2][0],.001);
		assertEquals(75.5, array[2][1],.001);
		assertEquals(-42.4, array[3][0],.001);
		assertEquals(73.5, array[3][1],.001);
		assertEquals(-59.0, array[3][2],.001);
		assertEquals(26.9, array[3][3],.001);
	}

}
