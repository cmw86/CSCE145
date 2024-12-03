//Connor Wiggins
import java.util.Scanner;
public class DateAndTimeTester {
	//Get Month from date string
	public int getMonth(String date)
	{
		String getMonth = date.substring(0,date.indexOf("/"));
		int month = Integer.parseInt(getMonth);
		return month;
	}
	//get day from date string
	public int getDay(String date) {
		
		String getDay = date.substring(date.indexOf("/")+1).trim();//takes index after "/" up until the last index
		int day = Integer.parseInt(getDay);
		return day;
	}
	//get hour from time string
	public int getHour(String time) {
		String getHour = time.substring(0,time.indexOf(":"));
		int hour = Integer.parseInt(getHour);
		return hour;
	}
	//get minute from time string
	public int getMinute(String time) {
		String getMinute = time.substring(time.indexOf(":")+1).trim();//takes index after ":" up until the last index
		int minute = Integer.parseInt(getMinute);
		return minute;
	}
	//tests month and day to see if they are valid
	public boolean isValidDate(String date) {
		int month = getMonth(date);
		int day = getDay(date);
		if (day<1||month<1||month>12||month==1&&day>31||month==2&&day>28||month==3&&day>31||month==4&&day>30||month==5&&day>31||month==6&&day>30
				||month==7&&day>31||month==8&&day>31||month==9&&day>30||month==10&&day>31||month==11&&day>30||month==12&&day>31) {
			return false;
		}
		else {
			return true;
		}
	}
	//tests hour and minute to see if they are valid
	public boolean isValidTime(String time) {
		int hour = getHour(time);
		int minute = getMinute(time);
		if (hour<1||hour>12||minute<0||minute>60) {
			return false;
		}
		else {
			return true;
		}
	}
	//Combines the validity to determine if both are valid
	public boolean isValid(String userInput) {
		String[] dateandtime= userInput.split(" ");//splits the main string by the space
		if(dateandtime.length!=2) {
			return false;
		}
		String date= dateandtime[0];
		String time= dateandtime[1];
		if(isValidTime(time) && isValidDate(date)) {
			return true;
		}
		else {
			return false;
		}
	}
	//run method
	public void run() {
		Scanner keyboard= new Scanner(System.in);
		boolean quit = false;
		while(!quit) {//keeps looping until user wants to quit
		System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid");
		String userInput = keyboard.nextLine();
		if(isValid(userInput)) {
			System.out.println("The date and time is valid!");
		}
		else {
			System.out.println("The date and time is not valid!");
		}
		System.out.println("Would you like to exit? Type 'quit' to exit or press [ENTER] to continue");
		String userResponse = keyboard.nextLine();
			if(userResponse.equals("quit")) 
			{
			 quit= true;
			}
			if(userResponse.isEmpty()) {
				quit=false;
			}
			
		}
	if (quit=true) {
				System.out.println("Goodbye!");
				System.exit(0);
			}
			
	}
}
