public class AssignmentLengthOfString{


    public static int lengthof(String str ){

        if(str.length()==0)
        {
            return 0;
        }

        return lengthof(str.substring(1))+1;
    }
    public static void main(String[]args)
    {


        String str = "Abcdefghi";
        System.out.print(length(str));
    }
}