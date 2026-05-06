package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods {

	public static void main(String[] args) {
	List L=new ArrayList();
	L.add("blue");
	L.add("green");
	L.add("1.5f");
	L.add("5");
	L.add("blue");
	System.out.println(L);
	System.out.println(L.get(2));
	L.set(1, "orange");
	System.out.println(L);
	System.out.println(L.indexOf("blue"));
	System.out.println(L.lastIndexOf("blue"));
	L.remove("black");
	System.out.println(L);
	System.out.println(L.contains("orange"));
	System.out.println(L.isEmpty());
	System.out.println(L.size());

	}

}
