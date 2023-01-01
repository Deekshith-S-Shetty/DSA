// Find a common element in all rows of a given row-wise sorted matrix
import java.util.*;

public class twoDCommonElementsInAllRows {

    public static int findCommon(int[][] mat) {
        HashMap<Integer, Integer> temp = new HashMap<>();

        for(int i = 0; i < mat.length; i++) {
            if(temp.containsKey(mat[i][0])) {
                temp.put(mat[i][0], temp.get(mat[i][0])+1);
            } else {
                temp.put(mat[i][0], 1);
            }

            for(int j = 1; j < mat[0].length; j++) {
                if(mat[i][j] != mat[i][j-1]) {
                    if(temp.containsKey(mat[i][j])) {
                        temp.put(mat[i][j], temp.get(mat[i][j])+1);
                    } else {
                        temp.put(mat[i][j], 1);
                    }
                }
            }

        }
        
        for(Map.Entry<Integer, Integer> ele : temp.entrySet()) {
            if(ele.getValue() == mat.length) {
                return ele.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) 
{
    int mat[][] = {{ 1, 2, 3, 4, 5 },
                   { 2, 4, 5, 8, 10 },
                   { 3, 5, 7, 9, 11 },
                   { 1, 3, 5, 7, 9 }};
    int result = findCommon(mat);
    if (result == -1)
        System.out.println("No common element");
    else
        System.out.println("Common element is " + result);
    }
}

