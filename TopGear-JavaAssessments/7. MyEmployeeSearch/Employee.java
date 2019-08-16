public class Employee {
	public String emp_ID;
	public String emp_Name;
	public String emp_Address;
	public Double emp_Salary;
	
	Employee(String ID, String Name, String Address, Double Salary)
	{		
		emp_ID = ID;
		emp_Name = Name;
		emp_Address = Address;
		emp_Salary = Salary;
	}
	public void displayEmployeeDetails()
	{
		System.out.println("******************************");
		System.out.println("Employee details requested... ");
		System.out.println("Employee ID      : " + emp_ID);
		System.out.println("Employee Name    : " + emp_Name);
		System.out.println("Employee Address : " + emp_Address);
		System.out.println("Employee Salary  : " + emp_Salary);
		System.out.println("******************************");
	}
}