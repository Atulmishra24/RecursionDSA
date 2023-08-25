import java.util.Scanner;

public class Fibbonacci_Series {

    public static int FindFibbonacciNumber(int n){
        if(n==1||n==0){
            return n ;
        }
        else {
            return FindFibbonacciNumber(n-2)+FindFibbonacciNumber(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fiboSum = FindFibbonacciNumber(num);
        System.out.println(fiboSum);
    }
}
