public class FriendsPairingProblemThirteen{


    public static void friendsPairing(int n){



        if(n==1|| n==2){
            return n;
        }

        // // single
        // int singleWays = friendsPairing(n-1);

        // //Pair
        // int fnp2 = friendsPairing(n-2);

        // int fairWays = (n-1)*fnp2;

        // int totalWays = singleWays+fairWays;

        // return totalWays;

        return friendsPairing(n-1)+ (n-1)*friendsPairing(n-2);
    }


    
    public static void main(String[] args){


        System.out.println(friendsPairing(4));


    }
}