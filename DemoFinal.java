public class DemoFinal
{
	public static void main(String[] args)
	{
		A obj = new A(5);
		obj.show();
	}
}
class A
{
	private int x; // instance variable
	public A(int x) // local variable
	{
		this.x=x;  // current instance
	}
	public void show()            //because of final show() in B can not override show() in A
	{
		System.out.println("x is :"+x);
	}
}
/*class B extends A
{
	public void show()
	{
		System.out.println("In B Show");
	}
}*/