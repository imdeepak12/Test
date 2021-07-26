import java.util.*;

public class ArrayListDemo
{
	public static void main(String[] args)
	{
		ArrayList l= new ArrayList();
		l.add("D");
		l.add(10);
		l.add("D");
		l.add(null);
		
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		l.add(2,"M");
		l.add("N");
		System.out.println(l);
	}
}