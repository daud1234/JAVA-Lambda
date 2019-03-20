package preconsupcomp;
import java.util.function.Function; 

public class Function1 { 
    public static void main(String args[]) 
    { 
  
        Function<Integer, Double> adds = a -> a + 5.0; 
        // 	takes int type and returns double type
        System.out.println(adds.apply(10)); 

        //---------------- using andThen       
        // Now treble the output of half function 
        
           adds = adds.andThen(a -> 4 * a); //1+5 then 6*4=24

           // apply the function to get the result 
           System.out.println(adds.apply(1)); 
          

           //----------------using compose method     
           // Now treble the output of half function 
           
           adds = adds.compose(a -> a*4); //1*4 then 4+5(main adds)
           System.out.println(); // then 9*4 (from the next method)

           // apply the function to get the result 
           System.out.println(adds.apply(1)); 
           
           //----------------using identity method     
           Function i = Function.identity(); 
           System.out.println(i); 
    } 
}