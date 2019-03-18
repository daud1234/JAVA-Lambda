package Lambda;

public class LambdaImplement1 {
	interface interface1
	{
		int jobparameter(int a, int b);
	}
	
	private int jobprocedure(int c, int d, interface1 a)
	{
		return a.jobparameter(c,d);
	}
	
	public static void main(String args[])
	{
		interface1 ifobjog=(int p, int q)->p+q;
		LambdaImplement1 liobj=new LambdaImplement1();
		
		System.out.println("Jog: "+liobj.jobprocedure(88, -44, ifobjog));
	}

}
