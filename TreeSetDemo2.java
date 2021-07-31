import java.util.*;
class TreeSetDemo2
{
	public static void main(String[] args)
	{
		TreeSet t = new TreeSet();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("N"));
		
		System.out.println(t);
	}
}