import java.util.*;
class HashSetDemo
{
	public static void main(String[] args)
	{
		LinkedHashSet h = new LinkedHashSet();  //If we replace HashSet with LinkedhashSet then insertion order will be preserved.
		h.add("A");                             //That is the main difference bw these two.
		h.add("L");
		h.add(15);
		h.add(null);
		h.add("Z");
		h.add("a");
		h.add("h");
		System.out.println(h.add("A"));   //Duplicates are not allowed it just returns false no CE or RE.
		System.out.println(h);
	}
}