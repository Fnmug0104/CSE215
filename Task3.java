package Lab4;

public class Task3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[][] array = {{3,4,9},{2,9,11},{4,6,0}};
		
		int i,j,row = 0,column = 0,diag1 = 0,diag2 = 0;
		
		for(i = 0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				row += array[i][j];
				
			}
			
			System.out.println("Sum of Row " + (i+1) + ": " + row);
			row = 0;
		}
		
		System.out.print("\n");
		
		for(i = 0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				column += array[j][i];
				
			}
			
			System.out.println("Sum of column " + (i+1) + ": " + column);
			column = 0;
		}
		
		System.out.print("\n");
		
		//Principal Diagonal = diag1
		
		for(i=0; i<3; i++)
		{
			diag1 += array[i][i];
			
		}
		System.out.println("Sum of principal diagonal: " + diag1);
		System.out.print("\n");

		//Second diagonal = diag2
		j = 0;
		
		for(i=2; i>-1; i--)
		{
			diag2 += array[i][j];	
			j++;
		}
		
		System.out.println("Sum of second diagonal: " + diag2);
		System.out.print("\n");
	}

}
