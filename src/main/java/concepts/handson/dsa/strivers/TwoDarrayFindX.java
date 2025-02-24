package concepts.handson.dsa.strivers;

public class TwoDarrayFindX {

    public static void main(String[] args) {

        //Given Matrix
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //mat.length gives numbers of rows
        //math[i].length gives number of columns at i'th row.
        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 5) {
                    System.out.println("array contains element value 5.");
                    System.exit(1);
                }
            }
        }

        System.out.println("Array does not contains this values.");
    }
}
