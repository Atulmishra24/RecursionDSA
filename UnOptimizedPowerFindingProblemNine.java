public class UnOptimizedPowerFindingProblemNine{


    public static int PrintPow(int x, int n){

        if(n==0){
            return 1;
        }

        return x *PrintPow(x, n-1);
    } 

    public static void main(String [] args){

        int x = 2;
        int n = 5;
        System.out.println(PrintPow(int x, int n));

    }
}