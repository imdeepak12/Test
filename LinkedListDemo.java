import java.util.*;
class LinkedListDemo
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.add("Deepak");
		l.add(10);
		l.add(null);
		l.add("Deepak");
		System.out.println(l);
		l.set(0,"Software");
		l.add("Venky");
		l.removeLast();
		l.addFirst("AAA");
		System.out.println(l);
	}
}