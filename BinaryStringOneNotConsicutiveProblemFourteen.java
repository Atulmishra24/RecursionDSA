public class BinaryStringOneNotConsicutiveProblemFourteen{
    
    public static void printBinaryString(int n , int Lp, String str){
//Base Case
        if(n==0){
          System.out.println(str);
          return;
        }
//Recursive Function

printBinaryString(n-1,0,str+"0");
if(Lp==0){
    printBinaryString(n-1,1,str+"1");

}
    }
    
    public static void main(String[] args){
        printBinaryString(6, 0 , "");
    }
}