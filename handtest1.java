package Lambda;

public class handtest1 {
	interface demo1
	{
		int calculation(int p,int q);
	}
	
	private int calculate(int l, int m, demo1 obj)
	{
		return obj.calculation(l, m);
	}
	
	public static void main(String args[])
	{
		demo1 addition=(int c,int d)->c+d;
		handtest1 hobj=new handtest1(); 
		
		System.out.println("Addition: "+hobj.calculate(22, 11, addition));
	}
}
