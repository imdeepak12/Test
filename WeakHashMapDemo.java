import java.util.*;
class WeakHashMapDemo
{
	public static void main(String[] args) throws Exception
	{
		WeakHashMap m = new WeakHashMap(); 
		Temp t = new Temp();
		m.put(t,"Dada");
		System.out.println(m);//{temp=dada}
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);//{temp=dada} 
		//If we replace it with WeakHashMap then temp object will be garbage collected
		//and o/p would be - Finalize method called {}
	}
}
class Temp
{
	public String toString()
	{
		return "temp";
	}
	public void finalize()
	{
		System.out.println("Finalize method called");
	}
}