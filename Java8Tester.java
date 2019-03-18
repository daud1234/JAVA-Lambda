package Lambda;

import Lambda.LambdaJava8Tester.MathOperation;

public class Java8Tester {

   final static String salutation = "Hello! ";
   
   public static void main(String args[]) {
      GreetingService greetService1 = message -> 
      System.out.println(salutation + message);
      greetService1.sayMessage("Mahesh");
   }
	
   interface GreetingService {
      void sayMessage(String message);
   }

int operate(int i, int j, MathOperation a) {
	// TODO Auto-generated method stub
	return a.operation(i,j);
}

}