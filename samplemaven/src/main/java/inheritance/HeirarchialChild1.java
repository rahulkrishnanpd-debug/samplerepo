package inheritance;

public class HeirarchialChild1 extends HeirarchialParent {

	public void print()
	{
	System.out.println("This is Child1");
}

	public static void main(String[] args) {
		HeirarchialChild1 obj=new HeirarchialChild1();
		obj.display();
		obj.print();
		// TODO Auto-generated method stub

	}

}
