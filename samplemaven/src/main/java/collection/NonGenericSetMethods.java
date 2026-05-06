package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethods {

	public static void main(String[] args) {
    Set a=new HashSet();
    a.add("apple");
	a.add("2");
	a.add("orange");
	System.out.println(a);
    Set b=new HashSet();
    b.add("grapes");
	b.add("1.5f");
	a.addAll(b);
	System.out.println(a);
	System.out.println(a.contains("apple"));
	System.out.println(a.containsAll(b));
	System.out.println(b.containsAll(a));
	System.out.println(a.isEmpty());
    a.remove("banana");
    System.out.println(a);
    a.removeAll(b);
    System.out.println(a);
    System.out.println(a.size());
    a.clear();
    System.out.println(a);

	}

}
