package exceptionhandling;

public class ExceptionExample {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try
		{
		int c=a/b;
		}
		catch(ArithmeticException d)
		{
			b=5;
			int c=a/b;
			System.out.println(c);
			System.out.println(d);
		}
		
		finally
		{
		System.out.println("Mandatory code");
		}
	
		// TODO Auto-generated method stub

	}

}
