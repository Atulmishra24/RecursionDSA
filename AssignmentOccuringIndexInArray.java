public class AssignmentOccuringIndexInArray{


    public static String occuringIndex(int []arr, int idx, int key, String result){


        
        if(idx==arr.length){
        

            
            return ;         
        }
    

        if(arr[idx]==key){
         System.out.print(idx+" ");      
        }


        occuringIndex(arr, idx+1, key,result);
    }
    public static void main(String []args){

       int arr[] = {3,2,4,5,6,2,7,2,2};
        occuringIndex(arr,0,2);
    }
}