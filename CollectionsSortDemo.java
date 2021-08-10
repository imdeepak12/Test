import java.util.*;
class CollectionsSortDemo
{
	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		l.add("F");
		l.add("A");
		l.add("K");
		l.add("K");
		l.add("A");
		
		System.out.println("Before Sorting :"+l);
		Collections.sort(l, new MyComparator());
		
		System.out.println("After Sorting :"+l);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = (String)obj2;
		
		return s2.compareTo(s1);
	}
}