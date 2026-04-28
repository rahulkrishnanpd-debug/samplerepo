package polymorphism;

public class PolyChild extends PolyParent {
	public void display()
	{
		System.out.println("This is the Child");
		super.display();
	}

	public static void main(String[] args) {
		PolyChild obj=new PolyChild();
		obj.display();
		// TODO Auto-generated method stub

	}

}
