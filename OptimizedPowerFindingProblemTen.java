public class OptimizedPowerFindingProblemTen{



    public static int PrintPowOp(int x , int n)
{

     if(n==0){
        return 1;
     }
     int halfPower = PrintPowOp(x , n/2);

     int fullPower = halfPower+
      halfPower;


    //   Odd Will Check For ALl
     if(n% 2 != 0){
         return x * fullPower ; 
     }

     return fullPower;


}
    public static void main(String[]args){
        int x=2;
        int n=5;
        System.out.println(PrintPowOp( x,n));
    }
}