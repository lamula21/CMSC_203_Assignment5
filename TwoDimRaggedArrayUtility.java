import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility extends Object {

	
	public TwoDimRaggedArrayUtility(){}
	
	
	public static double getHighestInArray(double[][] data) {
		

		double highest = data [0][0];
		
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			
				if ( data [i][j] > highest  )
					highest = data [i][j];
		}
		
		
		return highest;
	}

	public static double  getLowestInArray(double[][] data){
		
		double lowest = data [0][0];
		
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			
				if ( data [i][j] < lowest  )
					lowest = data [i][j];
		}
		
		
		return lowest;
	}
	

	
	
	
	public static double getHighestInRow(double[][] data, int row) {

			double highestInRow = data [row][0];
	
			for (int j = 0; j < data[row].length; j++)
				if ( data [row][j] > highestInRow )
					highestInRow = data [row][j];

				
			return highestInRow;
		
	}
	
	public static int	getHighestInRowIndex(double[][] data, int row) {
		
		double highestInRow = data [row][0];
		int index = 0;
		
		for (int j = 0; j < data[row].length; j++)
			if ( data [row][j] > highestInRow ) {
				highestInRow = data [row][j];
				index = j;
			}

			
		return index;
		
	}
	
	
	
	
	
	public static double getHighestInColumn(double[][] data, int col) {
		
		double highestInCol = Double.MIN_VALUE;
		
		for (int i = 0; i < data.length; i++)
			if ( col < data[i].length )
				if ( data [i][col] > highestInCol )
					highestInCol = data [i][col];

			
		return highestInCol;

	}
	
	static int	getHighestInColumnIndex(double[][] data, int col) {
		
		int index = 0;
		double highestInCol = data [0][col];
		
		for (int i = 0; i < data.length; i++) {
			
			if ( col < data[i].length) 
				if ( data [i][col] > highestInCol ) {
				highestInCol = data [i][col];
				index = i;
				}
		}

			
		return index;

	}
	
	

	
	
	
	public static double getLowestInRow(double[][] data, int row) {
		
		double lowestInRow = data [row][0];
		
		for (int j = 0; j < data[row].length; j++)
			if ( data [row][j] < lowestInRow )
					lowestInRow = data [row][j];

			
		return lowestInRow;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row) {
		
		int index = 0;
		double lowestInRow = data [row][0];
		
		for (int j = 0; j < data[row].length; j++)
			if ( data [row][j] < lowestInRow ) {
					lowestInRow = data [row][j];
					index = j;
			}

			
		return index;
	}
	

	
	
	
	
	public static double getLowestInColumn(double[][] data, int col) {			
		
		double lowestInCol = Double.MAX_VALUE;							
		
		
		for (int i = 0; i < data.length; i++) {								
			
			if ( col < data[i].length ) {
				
				if ( data [i][col] < lowestInCol )
					lowestInCol = data [i][col];
					
				
			}
			
		}
	
		return lowestInCol;
	}
	
	public static int	getLowestInColumnIndex(double[][] data, int col) {
		
		int index = 0;
		double lowestInCol = data [0][col];
		
		for (int i = 0; i < data.length; i++)
			while ( col < data[i].length )
			{
				if ( data [i][col] < lowestInCol ) {
					lowestInCol = data [i][col];
					index = i;
				}
				
				break;
			}

			
		return index;
	}
			

	
	
	
	
	public static double getTotal(double[][] data) {
		
		double total = 0.0;
		
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			
		
					total  += data [i][j];
		}
		
		return total;
	}
	
	public static double getAverage(double[][] data) {
		
		double count = 0.0;
		double average = 0.0;
		double total = 0.0;
		
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++) {
			
					count ++;
					total  += data [i][j];
			}
		}
		
		return total/count;
	}
	
	
	
	
	
	
	public static double getRowTotal(double[][] data, int row) {
		
		double rowTotal = 0.0;
		
		for (int j = 0; j < data[row].length; j++)	
			rowTotal += data [row][j];

		return rowTotal;	
	}
	
	public static double getColumnTotal(double[][] data, int col) {
		
		double colTotal = 0.0;
		
		for (int i = 0; i < data.length; i++)	
			
			if ( col < data[i].length ) {
				
			colTotal += data [i][col];
			
			}

		return colTotal;	
	}
	
	
	
	
	
	public static double[][]	readFile(File file) throws FileNotFoundException{
		
		Scanner scanner = new Scanner (file);
		
		String temporaryfileArray [][] = new String [10][10];
		double[][] filearray = null;
		
		int rows = 1;
		int columns ;
		
		// This for loop is to calculate how many rows
		for ( int i = 0; scanner.hasNextLine() && i < temporaryfileArray.length; i++) {			//   5      8    9   null
			
			// Create the number of rows in filearray
			// rows starts with 1																//   2      2  null  null  
			filearray = new double[rows][];	
			
			// Read whole line of the textfile and copy to the temporaryArray row				//   1      2    4   5
			temporaryfileArray[i] = scanner.nextLine().split(" ");								
			
			// increment rows to create a new filarray with specific rows  in the next loop
			rows ++;
		}		
		
		
		
		
		// This for loop is to calculate how many columns
		for ( int i = 0; i < filearray.length; i++) {
			
			columns = 0;
			
			//Inner loop, for each column of temporaryArray
			for ( int j = 0 ; j < temporaryfileArray[i].length; j++)
			{
				
				// If there is a element, 
				if ( temporaryfileArray[i][j] != null ) 
				{
					// So there is one more column
					columns += 1;
				}

			}
			// Create in each row of fileArray, create its specific columns
			filearray[i] = new double [columns];
		}
		
		

		// Copy temporaryArray elements to fileArray
		for ( int i = 0; i < filearray.length ; i++)
			for ( int j = 0; j < filearray[i].length; j++)
			{
				filearray[i][j] = Double.parseDouble(temporaryfileArray[i][j]) ;
			}
		
		scanner.close();
		return filearray;
	}
	
	
	
	public static void	writeToFile(double[][] data, File outputFile)  throws FileNotFoundException {
		
		 
		PrintWriter inFile = new PrintWriter(outputFile);
		for (int i = 0; i < data.length; i++) {
			for ( int j = 0; j < data[i].length; j++) 
				inFile.print(data[i][j] + " ");
			inFile.println();
		}
		// Close File
		inFile.close();
	}
	
	
}
