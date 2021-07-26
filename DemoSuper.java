public class DemoSuper
{
	public static void main(String[] args)
	{
		B obj = new B();
		obj.show();
	}
}
class A
{
	int i = 5;
	/*public void show()
	{
		System.out.println("In Show A");
	}*/
}
class B extends A
{
	int i = 4;
	 public void show()
	{
		System.out.println(super.i);
	}
}
