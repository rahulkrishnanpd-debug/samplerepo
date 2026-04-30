package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		int age=10;
		if(age>=18)
		{
			System.out.println("Elligible to vote");
		}
		else
		{
			throw new ArithmeticException("Enter age above 18");
		}
		// TODO Auto-generated method stub

	}

}
