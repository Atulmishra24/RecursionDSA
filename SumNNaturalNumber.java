public class SumNNaturalNumber{


    public static int sumNNum(int n ){


        if(n==1){
            return 1;
        }
        int prev = sumNNum(n-1);
        int sum = n+ sumNNum;
        return sum;
    }

    public static void main(String[] args){

        System.out.println(sumNNum(5));

    }
}