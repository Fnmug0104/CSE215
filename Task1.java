package Lab4;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int i,count=0,sum = 0;
		
		int[] array = new int[6];
		
		System.out.println("Enter 6 numbers: ");
		
		for(i = 0; i < 6; i++)
		{
			array[i] = scan.nextInt();
			sum += array[i];
		}

		

		
		double average = sum/6.0;
		
		for(i=0; i<6; i++)
		{
			if(array[i]>average)
			{
				count++;
			}
		}
		
		double percentage = (count*100)/6.0;
		
		System.out.println("The average is: " + average);
		System.out.println("The percentage of numbers greater than the average is: " + percentage + "%");

		
	}

}
