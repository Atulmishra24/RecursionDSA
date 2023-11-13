public class AssignmentPrintNumberinWords{


    public static void printNumberInWord(int n, String arr){


        if(n==0){
            return;
        }
        
        int singlenum = n%10;
        printNumberInWord(n/10, arr);

        System.out.print(arr[singlenum]+" ");



    }

    public static void main(String[]args){
        String arr[]= {"zero","one","two", "three", "four", "five", "six", "seven"};
        int num = 1947;
        printNumberInWord(num , arr);
    }
}