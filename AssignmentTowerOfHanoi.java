public class AssignmentTowerOfHanoi{


    public static void towerOfHanoi(int n , char src , char des , char help){
        if(n==1){
            System.out.print("Move Disk " + n +" From "+src + "to "+ des);
            return;
        }
        
        towerOfHanoi(n-1, src, help , des);
        System.out.print("Move Disk " + n +" From "+src + "to "+ des);
        towerOfHanoi(n-1, help,des,src);
    }
    public static void main(String[] args){
        //    n , SRC, DES , Help
        towerOfHanoi(3,'A','C','B');

    }
}