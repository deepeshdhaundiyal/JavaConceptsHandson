package concepts.handson.muoro;

//Longest Uniform SubSequence
public class LongestUniformSubSequence
{
    public static void main(String[] args) {
        
        String input = "aaqbbbcccccdde";

        System.out.println(findTheLongestUniformSeq(input));
    }

    //method to find the Longest Uniform SubSequence
    private static String findTheLongestUniformSeq(String input) {

        //Check for null values or empty values
        if(input.length() == 0 || input == null) return "";

        //declaring attributes
        int uniformSeqCount = 1;
        
        int longestUniformSeqCount = 1;
        
        char uniformSeq = 0;

        //traverse a loop resulting O(n) time complexity
        for (int i=1; i< input.length(); i++){
            
            if(input.charAt(i) == input.charAt(i-1)){
                uniformSeqCount++;
            }else{
                uniformSeqCount = 1;
            }
            
            if(longestUniformSeqCount < uniformSeqCount){
                longestUniformSeqCount = uniformSeqCount;
                uniformSeq = input.charAt(i);
            }
        }

        return uniformSeq + " - " + longestUniformSeqCount;
    }
}
