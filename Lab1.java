import java.util.Scanner;


public class Lab1 {

	public static void main(String[] args)
	{
		
		/*int array[];
		
		array = new int[5];
		
		System.out.println("Enter your ages: ");*/
		
		
		Scanner scan = new Scanner(System.in);
		
		
		/*for ( int i = 0 ; i < 5; i++)
		{
			array[i] = scan.nextInt();
		}
		
		for ( int i = 0 ; i < 5; i++)
		{
			System.out.println("Age of person " + (i+1) + " is: " + array[i]);

		}*/
		
		float cgpa = 3.98f;
		double gpa = 3.42;
		
		
		System.out.println("Hello World!");
		System.out.println(cgpa);
		System.out.println("Your term gpa is: " + gpa);

		
		scan.close();

	}

}
