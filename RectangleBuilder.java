//Connor Wiggins
import java.util.Scanner;

public class RectangleBuilder {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double maximum=0;
		double minimum=0;
		System.out.println("Welcome to the rectangle comparison program");
		
		
		//Takes data size from user
		System.out.println("How many rectangles will you be comparing today?");
		int r =keyboard.nextInt();
		keyboard.nextLine();
		
		//Uses a two dimensional array to collect length and Width of each rectangle based on the data size
		double [][] rArray= new double[r][2];
		for(int i=0;i<rArray.length;i++)
		{
			for(int j=0;j<rArray[i].length;j++)
			{
				if(j==0) {
					System.out.println("Enter the length of rectangle " + (i+1));
					rArray[i][j]=keyboard.nextDouble();
					keyboard.nextLine();

				}
				else {
					System.out.println("Enter the width of rectangle " + (i+1));
					rArray[i][j]=keyboard.nextDouble();
					keyboard.nextLine();

				}
			}
		}
		
		//Finds a displays the area of each rectangle using a new array
		double[] area= new double[r];
		double sum=0.0;
		for(int i=0;i<rArray.length;i++)
		{
			area[i] = rArray[i][0]*rArray[i][1];
			System.out.println("The area of rectangle "+(i+1)+ " is "+ area[i]);
			sum+=area[i];
			
		}
		
		//Asks for user formatting method then displays each area in that format
		boolean valid =false;
		do {
		System.out.println("Enter 'small' to sort the rectangles from smallest to largest. Enter 'large' to sort the data from largest to smallest.");
		String userSort = keyboard.next();
		if (userSort.equals("small")){
			for(int i=0;i<rArray.length-1;i++) {
				if (area[i]>area[i+1]) {
					double temp = area[i];
					area[i]=area[i+1];
					area[i+1]=temp;
					}
			}
			for(int i=0;i<rArray.length;i++) {
				System.out.println(area[i]);
			}
			minimum+=area[0];
			maximum+=area[area.length-1];
			valid=true;
			break;
		}
		if (userSort.equals("large")){
			for(int i=rArray.length-1;i>0;i--) {
				if (area[i]>area[i-1]) {
					double temp = area[i-1];
					area[i-1]=area[i];
					area[i]=temp;
					}
			}
			for(int i=0;i<rArray.length;i++) {
				System.out.println(area[i]);
			}
			minimum+=area[area.length-1];
			maximum+= area[0];
			valid=true;
		}
		else {
			System.out.println("Invalid Sorting format!");
			valid=false;
		}
		}while(!valid);
		
		//Finds minimum, maximum or average area based on user input
		do {
		System.out.println("Type 'average' to see the average area, type 'min' to see the minimum area, type 'max' to see the maximum area, or type 'quit' to exit");
		String userResponse = keyboard.next();
		double averageArea=sum/area.length;
		if(userResponse.equals("average")) 
		{ 
			System.out.println("The average area is " +averageArea);
			continue;
		}
		if(userResponse.equals("min")) 
		{ 
			System.out.println("The minimum area is " +minimum);
			continue;
		}
		if(userResponse.equals("max")) 
		{ 
			System.out.println("The maximum area is " +maximum);
			continue;
		}
		if(userResponse.equals("quit")) 
		{ 
			valid=false;
		}
		else {
			System.out.println("Invalid input!");
		}
		}while(valid);
	System.out.println("Goodbye!");
	}
}
