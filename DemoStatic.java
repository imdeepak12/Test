public class DemoStatic
{
static String s = "";
	
	static
	{
		s="Hello Aliens";
	}
	public static void main(String[] args)
	{
		System.out.println("The String is : " +s);
	}
}