import java.util.*;
public class MyEmployee {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int choice=0;
		String emp_ID, emp_Name, emp_Address;
		double emp_Salary;
		char emp_Srch_Fnd = 'N';
		ArrayList<Employee> arr_list=new ArrayList<Employee>(); 
		
		do
		{
			System.out.println("******************************");
			System.out.println("1. Add Employee Details");
			System.out.println("2. Search Employee Details");
			System.out.println("9. Exit");
			System.out.print("     Enter your choice : ");
			choice = input.nextInt();
			System.out.println("******************************");
			
			switch(choice)
			{
				case 1:
					arr_list.add(new Employee(getEmpID(),getEmpName(),getEmpAddress(),getEmpSalary()));
					break;
				case 2:
					emp_Srch_Fnd = 'N';
					System.out.println("Enter both employee ID & Name for searching.");
					emp_ID = getEmpID();
					emp_Name = getEmpName();
					Iterator arr_itr = arr_list.iterator();    //Got Iterator object.
					while(arr_itr.hasNext())
					{
						Employee emp_obj = (Employee)arr_itr.next();  
						//System.out.println(emp_obj.emp_ID + " " + emp_obj.emp_Name + " " + emp_obj.emp_Address + " " + emp_obj.emp_Salary); 
						if ((emp_obj.emp_ID.equalsIgnoreCase(emp_ID)) && (emp_obj.emp_Name.matches(emp_Name)))
						{
							emp_obj.displayEmployeeDetails();
							emp_Srch_Fnd = 'Y';
							break;
						}
						else
						{
							continue;
						}
					}
					if (emp_Srch_Fnd != 'Y')
						System.out.println("Employee Search not found.");
					break;
				default:
					System.out.println("Program Terminating... :)");
					choice = 9;
			}
		}while(choice != 9);
	}
	public static String getEmpID()
	{		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Employee ID      : ");
		String emp_ID = input.next();
		input.nextLine();    //consume extra 'enter' key press.
		return emp_ID;
	}	
	public static String getEmpName()
	{		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Employee Name    : ");
		String emp_Name = input.nextLine();
		return emp_Name;
	}
	public static String getEmpAddress()
	{		
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter Employee Address : ");
		String emp_Address = input.nextLine();
		return emp_Address;
	}
	public static Double getEmpSalary()
	{		
		Scanner input = new Scanner(System.in);			
		System.out.print("Enter Employee Salary  : ");
		Double emp_Salary = input.nextDouble();
		return emp_Salary;
	}
}