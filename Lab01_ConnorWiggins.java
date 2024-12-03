//Connor Wiggins

import java.util.Scanner;

public class Lab01_ConnorWiggins {
	
	public static void main(String[] args) {
		System.out.println("What is your Zodiac sign? Enter your birthday --");
		System.out.println("Month followed by Day as numbers.");
		Scanner keyboard = new Scanner(System.in);
		int month = keyboard.nextInt();
		int day = keyboard.nextInt();
		//Aries
			 if(month == 3&&day >= 21&&day <= 31)
			{
				System.out.println("You are an Aries!");
			}
			 else if(month == 4&&day <= 19&&day >=1)
			{
				System.out.println("You are an Aries!");
			}
		//Taurus
			 else if(month == 4&&day <= 30&&day >=20)
				{
					System.out.println("You are a Taurus!");
				}
			else if(month == 5&&day >= 1&&day <=20)
			 {
				System.out.println("You are a Taurus!");
			 }
			//Gemini
			else if (month == 5&&day >= 21&&day <=31)
			 {
				System.out.println("You are a Gemini!");
			}
			else if (month == 6&&day >= 1&&day <=20)
			 {
				System.out.println("You are a Gemini!");
			}
			 //Cancer
			else if (month == 6&&day >= 21&&day <=30)
			 {
				System.out.println("You are a Cancer!");
			}
			else if (month == 7&&day >= 1&&day <=23)
			 {
				System.out.println("You are a Cancer!");
			}
			 //Leo
			else if (month == 7&&day >= 23&&day <=31)
			 {
				System.out.println("You are a Leo!");
			}
			else if (month == 8&&day >= 1&&day <=22)
			 {
				System.out.println("You are a Leo!");
			}
			 //Virgo
			else if (month == 8 &&day >= 23&&day <=31)
			 {
				System.out.println("You are a Virgo!");
			}
			else if (month == 9&&day >= 1&&day <=22)
			 {
				System.out.println("You are a Virgo!");
			}
			 //Libra
			else if (month == 9&&day >= 23&&day <=30)
			 {
				System.out.println("You are a Libra!");
			}
			else if (month == 10&&day >= 1&&day <=22)
			 {
				System.out.println("You are a Libra!");
			}
			 //Scorpio
			else if (month == 10&&day >= 23&&day <=31)
			 {
				System.out.println("You are a Scorpio!");
			}
			else if (month == 11&&day >= 1&&day <=21)
			 {
				System.out.println("You are a Scorpio!");
			}
			 //Sagittarius
			else if (month == 11&&day >= 22&&day <=30)
			 {
				System.out.println("You are a Sagittarius!");
			}
			else if (month == 12&&day >= 1&&day <=21)
			 {
				System.out.println("You are a Sagittarius!");
			}
			 //Capricorn
			else if (month == 12&&day >= 22&&day <=31)
			 {
				System.out.println("You are a Capricorn!");
			}
			else if (month == 1&&day >= 1&&day <=19)
			 {
				System.out.println("You are a Capricorn!");
			}
			 //Aquarius
			else if (month == 1&&day >= 20&&day <=31)
			 {
				System.out.println("You are an Aquarius!");
			}
			else if (month == 2&&day >= 1&&day <=18)
			 {
				System.out.println("You are an Aquarius!");
			}
			 //Pisces
			else if (month == 2&&day >= 19&&day <=29)
			 {
				System.out.println("You are a Pisces!");
			}
			else if (month == 3&&day >= 1&&day <=20)
			 {
				System.out.println("You are a Pisces!");
			}
			 //Invalid Month
			else if (month <  1||month > 12)
				{
				System.out.println("Invalid Month!");
			 }
			 //Invalid Day
			if (month==1 && day>31)
			{
				System.out.println("Invalid Day!");
			}
			else if(month==2 && day>29)
			{
				System.out.println("Invalid Day!");
			}
			else if(month==3 && day>31)
			{
				System.out.println("Invalid Day!");
			}
			else if(month==4 && day>30)
			{
				System.out.println("Invalid Day!");
			}
			else if(month==5 && day>31)
			{
				System.out.println("Invalid Day!");
			}
			else if(month==6 && day>30)
			{
				System.out.println("Invalid Day!");
			}
			else if(month==7 && day>31)
			{
				System.out.println("Invalid Day!");
			}
			else if(month==8 && day>31)
			{
				System.out.println("Invalid Day!");
			}
			else if(month==9 && day>30)
			{
				System.out.println("Invalid Day!");
			}
			else if(month==10 && day>31)
			{
				System.out.println("Invalid Day!");
			}
			else if(month==11 && day>30)
			{
				System.out.println("Invalid Day!");
			}
			else if(month==12 && day>31)
			{
				System.out.println("Invalid Day!");
			}
			else if(day<1)
			{
				System.out.println("Invalid Day!");
			}
	}//End of Main

}//End of Class
