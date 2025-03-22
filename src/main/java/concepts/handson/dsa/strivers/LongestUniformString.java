package concepts.handson.dsa.strivers;

import org.springframework.aop.scope.ScopedProxyUtils;

public class LongestUniformString {

    public static void main(String[] args) {

        String s = "Deepesh";

        System.out.println(longestUniformSubString(s));;
    }

    private static String longestUniformSubString(String s) {

        //handle null value or empty String case
        if(s == null || s.length() == 0 ){
            return "";
        }

        //declare attributes
        int seqCount = 1, maxSeq = 1;
        int maxSeqStartIndex = 0, startIndex = 0;

        String ans = "";

        for(int i = 1; i< s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                seqCount++;
            }else{
                seqCount = 1;
                startIndex = i;
            }

            if(seqCount > maxSeq){
                maxSeq = seqCount;
                maxSeqStartIndex = startIndex;
            }

            ans = s.substring(maxSeqStartIndex,maxSeqStartIndex+maxSeq);
        }

        return ans;
    }
}
