class ComparableDemo
{
	public static void main(String[] args)
	{
		System.out.println(("A").compareTo("Z")); //returns -ve if obj1 has to come before obj2
		System.out.println(("L").compareTo("K")); //returns +ve if obj1 has to come after obj2
		System.out.println(("B").compareTo("B")); //returns 0 if obj1 is equals to obj2
		System.out.println(("A").compareTo(null)); //NPE
	}
}