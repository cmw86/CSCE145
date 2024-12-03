//Connor Wiggins
public class AppleTester {
	 //main method
	public static void main(String[] args) {
		
		System.out.println("Welcome to the apple tester");
		//default apple
		System.out.println("Creating a default Apple");
		System.out.println("Printing the default apple's value");
		Apple apple1= new Apple();
		System.out.println(apple1);
		//new apple
		System.out.println("Creating another apple");
		System.out.println("Setting the new apple's values to the following valid values");
		System.out.println("Granny Smith 0.75 0.99");
		Apple apple2 = new Apple("Granny Smith", 0.75, 0.99);
		System.out.println(apple2);
		//another default that is generated from invalid inputs
		System.out.println("Creating another default apple");
		System.out.println("Then setting the new apple's values to the following, invalid values 'iPad 2.5 - 200'");
		System.out.println("Printing the newest apple's values which should not have changed from the default values");
		Apple apple3 = new Apple("iPad", 2.5,-200);
		System.out.println(apple3);
		//tests to see if both defaults are equal
		System.out.println("Checking if the first and last apple have the same values.");
		System.out.println(apple1.equals(apple3));
		
		
	
		
		
	}
}
