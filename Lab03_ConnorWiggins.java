//Connor Wiggins
import java.util.Scanner;

public class Lab03_ConnorWiggins {

	public static void main(String[] args) {
		System.out.print("Welcome to the below average temperature tester program.");
		System.out.println();
		Scanner keyboard = new Scanner(System.in);
		double sum = 0;
		
		double temperature[]=new double[10];
		//Temperature by day
		for(int i=0;i<temperature.length;i++)
		{
			System.out.println("Please enter the temperature for day "+(i+1));
			temperature[i]=keyboard.nextDouble();
			sum += temperature[i];//adds all temperatures for later
		}
		//Average Temperature
		double averageTemperature = sum/temperature.length;//uses the sum from earlier to calculate the average
		System.out.println("The average temperature was "+averageTemperature);
		//Days with less than average temperature
		System.out.println("The days that were below the average temperature were:");
		for(int i=0;i<temperature.length;i++)
		{
			if (temperature[i] < averageTemperature)//cycles through array for temperatures less than the average
			{
				System.out.println("Day " +(i+1)+" when the temperature was "+ temperature[i]);
			}
		}
		
	}
	
}
