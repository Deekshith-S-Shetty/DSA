import java.util.*;

public class DiagonalTraversalOfMatrix {

    static ArrayList<ArrayList<Integer>> diagonalOrder(int[][] M) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i = 0; i < M.length; i++) {
            int row = i;
            int col = 0;
            ArrayList<Integer> temp = new ArrayList<>();
            while(row >= 0 && col < M[0].length) {
                temp.add(M[row][col]);
                row--;
                col++;
            }
            res.add(temp);
            temp = new ArrayList<>();
        }

        for(int i = 1; i < M[0].length; i++) {
            int col = i;
            int row = M.length-1;
            ArrayList<Integer> temp = new ArrayList<>();
            while(row >= 0 && col < M[0].length) {
                temp.add(M[row][col]);
                row--;
                col++;
            }
            res.add(temp);
            temp = new ArrayList<>();
        }

        return res;
    }

    public static void main(String[] args)
    {
        int[][] M = {{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
                     { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
        
        System.out.print("\nDiagonal printing of matrix is : \n");
        ArrayList<ArrayList<Integer>> res = diagonalOrder(M);

        for(int i = 0; i < res.size(); i++) {
            for(int j = 0; j < res.get(i).size(); j++) 
                System.out.print(res.get(i).get(j) + "  ");
            System.out.println();
        }
    }
}