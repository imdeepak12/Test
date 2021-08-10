class TestDemo
{
	public String m(){
		return null;
	}
}
class C extends TestDemo{
	public Object m(){         //error - return type Object is not compatible with String
		return null;
	}
}