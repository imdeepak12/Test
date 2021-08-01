import java.util.*;
class HashMapDemo
{
	public static void main(String[] args)
	{
		HashMap m = new HashMap();
		m.put("Arjun",100);
		m.put("Pooja",50);
		m.put("Rama",200);
		m.put("null",120);
		m.put(new StringBuffer("GGG"),100);
		
		System.out.println(m);//{key=value,.....}
		System.out.println(m.put("Arjun",500));
		
		Set s = m.keySet();
		System.out.println(s);// [All Keys]
		
		Collection c = m.values();
		System.out.println(c);// [All Values]
		
		Set s1 = m.entrySet();
		System.out.println(s1);//[key=value,....]
		
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"--"+m1.getValue());//key--value
			if(m1.getKey().equals("DK"))
			{
				m1.setValue(10000);
			}
		}
		System.out.println(m);//{key=value,.....}
	}
}