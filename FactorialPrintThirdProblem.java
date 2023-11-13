public class FactorialPrintThirdProblem{

    public static int fact(int n){


        if(n==0){
            return 1;
        }

        int fn = fact(n-1);
        int result = n*fn;
        return result;
    }
    public static void main(String[] args){
        System.out.println(fact(5));
    }
} 