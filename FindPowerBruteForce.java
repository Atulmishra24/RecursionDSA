import java.util.Scanner;

public class FindPowerBruteForce {
    public static long findPower(int a , int b){
        long result = 0 ;
        if(b==1){
            return a;
        }
        else{
            result = a*findPower(a, b-1);
        }

        return result;
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
