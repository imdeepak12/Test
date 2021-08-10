import java.util.*;
class NavigableSetDemo
{
	public static void main(String[]args)
	{
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		
		System.out.println(t);
		System.out.println(t.floor(3));
		System.out.println(t.lower(3));
		System.out.println(t.ceiling(2));
		System.out.println(t.higher(2));
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		System.out.println(t.descendingSet());
		
		System.out.println(t);
	}
}