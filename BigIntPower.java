import java.util.*;
import java.math.*;
public class BigIntPower {
    public static BigInteger findPowerOptimal(BigInteger a , int b){
        BigInteger result, finalResult;
        if(b==1){
            return a;
        }
        else{
             result = findPowerOptimal(a, b/2);
            finalResult=result.multiply(result); 
            if(b%2==0){
                return finalResult;
            }
            else{
                return a.multiply(finalResult);
            }
               }
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of a, b ");
        BigInteger a = sc.nextBigInteger();
        int b = sc.nextInt();
        BigInteger result = findPowerOptimal(a,b);
        System.out.println(result);
}
}
