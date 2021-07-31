import java.util.*;
class SyncDemo
{
	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		l.add(10);
		l.add("A");
		l.add(5);
		l.add(null);
		
		System.out.println(l);
		List l1 = Collections.synchronizedList(l);
		System.out.println(l1);
	}
}