package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		List <String> L=new ArrayList <String> ();
		L.add("blue");
		L.add("green");
		L.add("black");
		L.add("red");
		L.add("blue");
		System.out.println(L);
		System.out.println(L.get(2));
		L.set(1, "orange");
		System.out.println(L);
		System.out.println(L.indexOf("blue"));
		System.out.println(L.lastIndexOf("black"));
		L.remove("black");
		System.out.println(L);
		System.out.println(L.contains("orange"));
		System.out.println(L.isEmpty());
		System.out.println(L.size());

	

	}

}
