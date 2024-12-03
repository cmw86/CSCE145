//Connor Wiggins

import java.util.Scanner;

public class Lab02_ConnorWiggins {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Triangle Maker! Enter the size of the triangle.");
		Scanner keyboard = new Scanner(System.in);
		int triangleSize = keyboard.nextInt();
		//ascending triangle
		for (int i=1; i<=triangleSize;) {//rows will keep printing until i=triangleSize
			for( int j = 1; j<=i;) {//*'s will keep printing until j=triangleSize
			System.out.print("*");
			j++;//adds one * per row
		}
			System.out.println();//next row
			i++;
		}
		//descending triangle
		for (int i = triangleSize-1; i>=1;) {//rows will keep printing until i=1
			for (int j = triangleSize-1; j>=1;) {//*'s will keep printing until j=1
				System.out.print("*");
				j--;//subtracts one * per row
			}
			System.out.println();//next row
			i--;
			triangleSize--;
		}
	}
}
