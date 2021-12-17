import java.util.Scanner;

class student
{ 
	int Regno;
	String StudentName;
	student(int Regno, String StudentName)
	{
		this.Regno=Regno;
		this.StudentName=StudentName;
		
	}

}
public class StudentArray 
{
	
	public static void main(String[] args) 
	{
		//Array of object
		student stnd[];
		stnd= new student[5];
		
		for (int i=0;i<=4;i++)
		{
			Scanner scr= new Scanner(System.in);
			System.out.println("Please Enter Student Registration No:-");
			int Registration=scr.nextInt();
			System.out.println("Please Enter Student Name:-");
			String Student_name=scr.next();
			stnd[i]= new student(Registration,Student_name);
			
		}
		for(int j=0;j<stnd.length;j++)
		{
			System.out.println(stnd[j]);
		}
			for(int j=0;j<stnd.length;j++)
			{
				System.out.println("Studnt Registration no is:-"+stnd[j].Regno+"And Student name is:-"+stnd[j].StudentName);
			}
		
	
	}

}
