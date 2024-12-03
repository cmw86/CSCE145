//Connor Wiggins
import java.util.Scanner;

public class HW02_ConnorWiggins {

	public static void main(String[] args) {
		//First four bit number
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a 4-bit number");
		String fourBit1= keyboard.nextLine();
	        double total1 = 0;
	        for (int i = 0; i < 4; i++) {
	            String bit1 = fourBit1.substring(i, i + 1);//pulls substring with bounds from the entered four-bit main string
	            double value1 = Double.parseDouble(bit1);//converts to double for multiplication
	            value1*=Math.pow(2, i);//multiplies the value of the bit by 2^i
	            total1 += value1;//adds each substring together for the final total
	        }
	      //Second four bit number
	    System.out.println("Enter another 4-bit number");    
	    String fourBit2= keyboard.nextLine();
	       	double total2 = 0;
	        for (int i = 0; i < 4; i++) {
	            String bit2 = fourBit2.substring(i, i + 1);
	            double value2 = Double.parseDouble(bit2);
	            value2*=Math.pow(2, i);
	            total2 += value2;
	        }
	        //Four bit values and sum
	        System.out.println("The first number is " + total1);
	        System.out.println("The first number is " + total2);
	        double sum = total1+total2;
	        System.out.println("The numbers added together is " + sum);
	        
		
		

		

	}

}
