
class Const
{
	int i;
	float f;
public static void main(String[] args)
	{
		Const obj = new Const(5);
	}
public Const()
{
	i=5;
	f=5.5f;
	System.out.println("Hi");
}
public Const(int k)
{
	i=k;
	System.out.println("Hello");
}
}