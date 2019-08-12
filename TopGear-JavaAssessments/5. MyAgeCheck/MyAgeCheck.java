class MyInvalidAgeException extends Exception {
	
}

public class MyAgeCheck {
  public static void main(String[] args) {
	if(args.length != 2)
	{
		System.out.println("Enter both name and age only for validation.");
		System.exit(1);
	}	  
	
    String name = args[0];
	int age = 0;
	try
	{
		age = Integer.parseInt(args[1]);
	}
	catch(NumberFormatException nfe)
	{
		System.out.println("Entered age is not numeric for " + name);
		System.exit(1);
	}
	if(age>=18 && age<60)
	{
		System.out.println("Entered age " + age + " is valid for " + name);
	}
	else
	{
		try
		{
			throw new MyInvalidAgeException();
		}
		catch(MyInvalidAgeException miae)
		{
			System.out.println("Entered age must be from 18 up & below 60");
			System.exit(1);
		}
	}		
  }
}