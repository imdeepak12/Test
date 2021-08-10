import java.util.*;
class HashtableDemo
{
	public static void main(String[] args)
	{
		Hashtable h = new Hashtable();
		h.put(new Temp(5),"B");
		h.put(new Temp(2),"A");
		h.put(new Temp(9),"C");
		h.put(new Temp(15),"D");
		h.put(new Temp(23),"F");
		h.put(new Temp(16),"L");
		
		System.out.println(h);
	}
	
}
class Temp
{
	int i;
	Temp(int i)
	{
		this.i = i;
	}
	public int hashCode()
	{
		return i;
	}
	 public String toString()
	{
		return i+"";
	}
}