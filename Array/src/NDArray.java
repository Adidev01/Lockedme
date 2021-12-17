import java.util.*;
public class NDArray {

	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in);
		int matrix[][]= new int[3][3];
		
		 double Temp[][]= new double[3][3];
	     String name[][]=new String[3][3];
		
		System.out.println("Input the Matrix:");
		for(int i=0;i<3;i++) //i=0;
		{
			for(int j=0;j<3;j++)  //i=0; j=0,1,2  i=1 j=0,1,2  i=2 j=0,1,2
			{
				matrix[i][j]= scr.nextInt();
			}
		}
		System.out.println("Input the Temp:");
		for(int i=0;i<3;i++) //i=0;
		{
			for(int j=0;j<3;j++)  //i=0; j=0,1,2  i=1 j=0,1,2  i=2 j=0,1,2
			{
				
				Temp[i][j]=scr.nextDouble();
				
			}
		}
		System.out.println("Input the Matrix:");
		for(int i=0;i<3;i++) //i=0;
		{
			for(int j=0;j<3;j++)  //i=0; j=0,1,2  i=1 j=0,1,2  i=2 j=0,1,2
			{
				name[i][j]=scr.next();
			}
		}
		System.out.println("Printing the Matrix:");
		for(int i=0;i<3;i++) //i=0;
		{
			for(int j=0;j<3;j++)  //i=0; j=0,1,2  i=1 j=0,1,2  i=2 j=0,1,2
			{
				System.out.print(matrix[i][j] +"    ");
				
			}
		   System.out.println( );
		}
		double var=0;
		int k=0;
		int l=0;
		System.out.println("Printing the Temp:");
		for(int i=0;i<3;i++) //i=0;
		{
			for(int j=0;j<3;j++)  //i=0; j=0,1,2  i=1 j=0,1,2  i=2 j=0,1,2
			{
				if(Temp[i][j]>200)
				{
				   var=Temp[i][j];
				   k=i;
				   l=j;
				
				}
			}
		}
		System.out.println(var +"    "+name[k][l]);
		System.out.println("Printing the city:");
		for(int i=0;i<3;i++) //i=0;
		{
			for(int j=0;j<3;j++)  //i=0; j=0,1,2  i=1 j=0,1,2  i=2 j=0,1,2
			{
				System.out.print(name[i][j] +"    ");
			}
		   System.out.println( );
		}
	}

}
