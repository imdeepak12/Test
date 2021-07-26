public class CountObj
{
	static int i=0;
	public CountObj()
	{
		i++;
	}
	public static void main(String[] args)
	{
		CountObj obj1=new CountObj();
		//CountObj obj2=new CountObj();
		CountObj obj3=new CountObj();
		obj3.counter();
		
	}
	public void counter()
	{
		System.out.println(i);
	}
}
