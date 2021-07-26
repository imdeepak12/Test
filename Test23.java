public class Test23
{
	public static void main(String[] a)
	{
		Abc.show();
		Abc.i=5;
	}
}
class Abc
{
	static int i;
	public static void show()
	{
		System.out.println("Hello");
		System.out.println(i);
	}
}