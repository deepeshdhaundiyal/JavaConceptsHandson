package concepts.handson.dsa.strivers;

import java.util.Arrays;

public class TwoAnagramString {

    private static boolean isStringEqual(String a, String b){

        if(a.length() != b.length()){
            return false;
        }

         char [] aa = a.toCharArray();
         char [] bb = b.toCharArray();

         Arrays.sort(aa);
         Arrays.sort(bb);
         return Arrays.equals(aa,bb);

    }
    public static void main(String[] args) {

        String a = "slisten";
        String b = "silents";

        System.out.println(TwoAnagramString.isStringEqual(a,b));

    }

}
