public class DemoDynamicMethod
{
	public static void main(String[] args)
	{
		A obj1 = new A();
		B obj2 = new B();
		
		A a;
		a = obj2;       //Dynamic Method Display, Runtime polymorphism
		a.show();
	}
}
class A
{
	public void show()
	{
		System.out.println("In show A");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("In show B");
	}
}