package Lab4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int i;
		
		System.out.print("Enter size: ");		
		int a = scan.nextInt();
		
		int[] array = new int[a];
		
		System.out.println("Enter numbers: ");	
		
		for(i = 0; i < a ; i++)
		{
			array[i] = scan.nextInt();
		}
		
		scan.close();
		
		System.out.print("Triple consecutive values: ");
		
		for(i = 0; i < a-2; i++)
		{
			if(array[i] == array[i+1] && array[i] == array[i+2])
			{
				System.out.print(array[i] + " ");
			}
		}
		
	}

}
