import java.util.*;
class TreeMapDemo
{
	public static void main(String[] args)
	{
		TreeMap m = new TreeMap(new MyComparator());
		m.put("AAA",20);
		m.put("ZZZ",50);
		m.put("LLL",10);
		m.put("TTT",0);
		m.put("AAA",70);
		m.put(100,20);
		
		System.out.println(m);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}