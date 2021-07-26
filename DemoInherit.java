public class DemoInherit
{
	public static void main(String[] args)
	{
		AddSub obj=new AddSub();
		obj.i=5;
		obj.j=4;
		obj.sum();
		System.out.println(obj.result);
		obj.sub();
		System.out.println(obj.result);
		
	}
}
class Add
{
	int i,j,result=0;   //single level inheritance
	public void sum()
	{
		result=i+j;
	}
}
class AddSub extends Add
{
	public void sub()
	{
		result=i-j;
	}
}