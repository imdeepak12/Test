class Variable
{
	int x=10;
	static int y=20;
	public static void main(String[] args)
	{
		Variable t1=new Variable();
		t1.x=888;
		t1.y=999;
		Variable t2=new Variable();
		System.out.println(t2.x+"..."+t2.y);
		
	}
}