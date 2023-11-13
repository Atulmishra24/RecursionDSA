public class RemoveDuplicateTweleveProblem {


    public static void removeDup(String str, int i , StringBuilder newStr , boolean[] map){


        // base Case 
        if(i==str.length()){
            System.out.println(newStr);
            return;
        }


        //Recursive Function

        char currentChar =  str.charAt(i);
        if(map[currentChar-'a']==true){
            //Duplicate

            removeDup(str,i+1,newStr, map);
        }
        else{
            map[currentChar-'a']= true;
            removeDup(str,i+1,newStr.append(currentChar),map);
        }

    }


    public static void main(String[] args){

        String str = "atttullmishhraaa";
        removeDup(str,0,new StringBuilder(""), new boolean[26])


    }
}