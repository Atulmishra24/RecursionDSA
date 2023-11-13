public class TilingProblemElevenPro{


    public static int tilePro(int n){

        // base Case

        if(n==0 || n==1){
            return 1;
        }


        // // Kaam
        // // Verticle
        // int fnm1 = tilePro(n-1);

        // // Horizonal

        // int fnm2 = tilePro(n-2);

        // // Total Ways

        // int totWays = fnm1+fnm2;
        
        
        // return totWays;



        return tilePro(n-1)+ tilePro(n-2);


    }

    public static void main(String[] args){

        System.out.println(tilePro(4));

    }
}