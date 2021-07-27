interface Interf
{
	public void m1();
	public void m2();
}
class ServiceProvider implements Interf
{
	public void m1()
	{
		
	}
}
class SubServiceProvider extends ServiceProvider
{
	public void m2()
	{}
	public void m2()    //either to implement m2() or declare class as abstract or inherit this class and provide implementation there
	{}
}
