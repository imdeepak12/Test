public class DemoInheritConst
{
	public static void main(String[] args)
	{
		B obj = new B(6);
	}
}
class A               //object creation in Inheritance
{
	public A()
	{
		System.out.println("In a Const A");
	}
	public A(int i)
	{
		System.out.println("In a Const A int");
	}
}
class B extends A
{
	public B()
	{
		System.out.println("In a Const B");
	}
	public B(int i)
	{
		System.out.println("In a Const B int");
	}
}