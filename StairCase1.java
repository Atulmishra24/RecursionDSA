import java.util.Scanner;


public class StairCase1 {
    public static int findStairWay(int a){
        int result =0;
        if(a==1||a==2){
            return a;
        }
        else{
            result = findStairWay(a-1)+findStairWay(a-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int a = sc.nextInt();
        int result = findStairWay(a);
        System.out.println(result);
    }
}
