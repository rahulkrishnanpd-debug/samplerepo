package exceptionhandling;

public class CustomException2 {

	public static void main(String[] args) throws AgeException {
		int age=10;
		if(age>=18)
		{
			System.out.println("Elligible to vote");
		}
		else
		{
			throw new AgeException("Enter age above 18");
		}
		

	}

}
