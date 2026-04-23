package inheritance;

public class HeirarchialChild2 extends HeirarchialParent {
	public void show()
	{
		System.out.println("This is Child2");
	}

	public static void main(String[] args) {
		HeirarchialChild2 obj=new HeirarchialChild2();
		obj.display();
		obj.show();
		// TODO Auto-generated method stub

	}

}
