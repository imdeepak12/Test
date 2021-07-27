class A
{
	public static void m1()  //if static is added to each method then it wont be overriding anymore
	                   //it will become method hiding then output will be different for each class "C B A"
	{
		System.out.println("A");
	}
}
class B extends A
{
	public static void m1()
	{
		System.out.println("B");
	}
}
class C extends B
{
	public static void m1()
	{
		System.out.println("C");
	}
}
class ObjTypeCastDemo
{
	public static void main(String[] args)
	{
		C c = new C();
		c.m1(); //C
		((B)c).m1();  //C
		((A)((B)c)).m1();  //C
	}
}