import java.util.Scanner;

public class arraySimple 
{
	public static void main(String []args)
	{
		String[] Name = new String[5];
		double[] Salary = new double[5];
		double[] Bonus = new double[5];
		
		
		for(int i=0;i<=4;i++)
		{ 
			Scanner scr = new Scanner(System.in);
			System.out.println("Please Enter the Name of Employee:-");
			Name[i]=scr.next();
			System.out.println("Please Enter the salary of Employee:-");
			Salary[i]=scr.nextDouble();
			System.out.println("Please Enter the Bonus of Employee:-");
			Bonus[i]=scr.nextDouble();
		}
		for(int i=0;i<=4;i++)
		{ 
			if(Salary[i]>10000)
			{
				System.out.println("Salary greater than thousand");
				System.out.println("Employee Name:-"+Name[i]+" Salary:-  " +Salary[i]+ " Bonus:-  "+Bonus[i]);
				
			}	
			else
			{
				System.out.println("Salary less than thousand");
				System.out.println("Employee Name:-"+Name[i]+" Salary:-  " +Salary[i]+ " Bonus:-  "+Bonus[i]);
			}
		}
	}

}
