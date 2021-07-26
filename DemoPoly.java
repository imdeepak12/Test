public class DemoPoly
{
	public static void main(String[] args)
	{
		B obj = new B();
		obj.show();
	}
}
class A            //method overriding, dynamic binding, late binding, runtime polymorphism
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