class DoubleEqualOprAndDotEqualsMethod
{
	public static void main(String[] args)
	{
		String s1=new String("DK");
		String s2=new String("DK");
		
		System.out.println(s1==s2);       //false, In general used for reference/address comparison
		System.out.println(s1.equals(s2));//true, Used for content comparison
	}
}