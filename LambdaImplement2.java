package Lambda;

public class LambdaImplement2 {
	interface interfacefunction
	{
		int interfacereturn(int a, int b);
	}
	private int functionoutofmain(int a1,int b1, interfacefunction i)
	{
		return i.interfacereturn(a1,b1);
	}
	
	public static void main(String args[])
	{
		interfacefunction ifobjplusfunctionadd=(int j,int k) ->j+k;
		interfacefunction ifobjplusfunctionsub=(int j,int k) ->j-k;
		interfacefunction ifobjplusfunctionmul=(int j,int k) ->j*k;
		interfacefunction ifobjplusfunctiondiv=(int j,int k) ->j/k;
		
		LambdaImplement2 liobj2=new LambdaImplement2(); 
		System.out.println("Addition operation(a+b): "+liobj2.functionoutofmain(20, 5, ifobjplusfunctionadd));
		System.out.println("Multiplication operation(a-b): "+liobj2.functionoutofmain(20, 5, ifobjplusfunctionsub));
		System.out.println("Subtraction operation(a*b): "+liobj2.functionoutofmain(20, 5, ifobjplusfunctionmul));
		System.out.println("Division operation(a/b): "+liobj2.functionoutofmain(20, 5, ifobjplusfunctiondiv));
	}
}
