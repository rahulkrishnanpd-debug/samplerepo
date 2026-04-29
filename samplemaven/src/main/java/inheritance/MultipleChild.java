package inheritance;

public class MultipleChild implements Parent1,Parent2 {
	
public void show()
{
	System.out.println("This is MultipleChild");
}
	public static void main(String[] args) {
		MultipleChild obj=new MultipleChild();
		obj.display();
		obj.print();
		obj.show();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("Parent1");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		System.out.println("Parent2");
		// TODO Auto-generated method stub
		
	}

}
