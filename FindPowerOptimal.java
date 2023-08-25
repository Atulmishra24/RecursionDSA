import java.util.*;

public class FindPowerOptimal {
    public static long findPower(int a, int b){
         int mid = 0; 
         long finalResult =0;
         long  result =0 ;
        if(b==1){
            return a;
        }
        else{
            mid=b/2;
            result = findPower(a, mid);
            finalResult=result*result;
            if(b%2==0){
                return finalResult;
            }
            else{
                return 2*finalResult;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter FIrst Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        long result = findPower(a,b);
        System.out.println("The value of a^b is : "+result);
    }
}
