package Lab4;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		
		int input = scan.nextInt();
		scan.close();
		
		int[] fib = new int[input];
		
		fib[0] = 0;
		fib[1] = 1;
		
		System.out.print("The fibonacci sequence: ");
		
		for(int i = 2; i< input; i++)
		{
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		for(int i = 0; i<input; i++)
		{
			System.out.print(fib[i] + " ");
		}
	}

}
