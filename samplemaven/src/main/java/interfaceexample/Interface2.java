package interfaceexample;

public class Interface2 implements Interface1 {
	public void show()
	{
		System.out.println("This is interface");
	}

	public static void main(String[] args) {
		Interface2 obj=new Interface2();
		obj.display();
		obj.print();
		obj.show();
//reference creation
		Interface1 obj1=new Interface2();
		obj1.display();
		obj1.print();

	}

	@Override
	public void display() {
		System.out.println("Abstract1");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		System.out.println("Abstract2");
		// TODO Auto-generated method stub
		
	}

}
