public class MyFactorial {
  public static void main(String[] args) {
    System.out.println("Hello World");
	int input = 6;
	int f = Factorial.myFactorial(input);
	System.out.println("Factorial of " + input + " is " + f); 
	}
	public static int myFactorial(int n)
	{
		if (n <= 0)
		{
			return 1;
		}
		return Factorial.myFactorial(n-1)*n;
	}
}