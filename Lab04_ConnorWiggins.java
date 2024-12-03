//Connor Wiggins

import java.util.Scanner;

public class Lab04_ConnorWiggins {

	public static void main(String[] args) {
		System.out.println("Welcome to the matric adder program!");
		Scanner keyboard = new Scanner(System.in);

		//Matrix 1
		System.out.println("Please enter the length and width of the first matrix");
		int length1 = keyboard.nextInt();
		int width1 = keyboard.nextInt();
		int [][] m1= new int[length1][width1];//uses user input to determine the size of the matrix
		for(int i=0;i<m1.length;i++)
		{
			
			for(int j=0;j<m1[i].length;j++)
			{
				System.out.println("Enter value at index " + i);//takes user input for each index and stores it in an array
				m1[i][j]=keyboard.nextInt();
			}
		}
		//Matrix 2
		System.out.println("Please enter the length and width of the second matrix");
		int length2 = keyboard.nextInt();
		int width2 = keyboard.nextInt();
		if (length1!=length2||width1!=width2)//only allows matrices to be the same size
		{
		System.out.println("**Error** Matrices must be equal in length and width");
		}
		else
		{
		int [][] m2= new int[length2][width2];
		for(int i=0;i<m2.length;i++)
		{
			
			for(int j=0;j<m2[i].length;j++)
			{
				System.out.println("Enter value at index " + i);
				m2[i][j]=keyboard.nextInt();
			}
		}
		//Addition of Matrices
			for(int i=0;i<m1.length;i++)
			{
				for(int j=0;j<m1[i].length;j++)
				{
					System.out.print(m1[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("+");
			for(int i=0;i<m2.length;i++)
			{
				for(int j=0;j<m2[i].length;j++)
				{
					System.out.print(m2[i][j]+" ");
				}
				System.out.println();
			}
		//Solution
			System.out.println("=");
				for(int i=0;i<m2.length; i++)
				{
					for(int j=0;j<m2[i].length;j++)
					{
						System.out.print((m2[i][j]+m1[i][j])+" ");//adds the the corresponding indices from each array
					}
					System.out.println();
				}
		}
		
		
	}

}
