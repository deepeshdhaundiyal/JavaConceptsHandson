package concepts.handson.dsa.strivers;

public class StairCaseSearchAlgorithm
{

    public static void main(String[] args) {

        int twoDmatrix [][] = {{1,2,3},{4,5,6},{7,8,9}};

        int targetedValue = 5;

        int i = 0;
        int j = twoDmatrix[0].length-1;

        while(i < twoDmatrix.length && j >= 0){

            if(twoDmatrix[i][j] == 5){
                System.out.println("element find at indexes (" + i + "," + j + ")");
            }else if(targetedValue > twoDmatrix[i][j])
            {
                i++;
            }else{
                j--;
            }
        }
    }

}
