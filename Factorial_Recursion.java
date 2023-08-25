import java.util.Scanner;

public class Factorial_Recursion {

    public static int findFacorial(int n){
        int result=0;
        if(n==0||n==1){
            return 1;
        }else {
            result =  n * findFacorial(n-1);
        }
        return result;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int value = sc.nextInt();
         int result = findFacorial(value); 
         System.out.println(result);
    }
}
