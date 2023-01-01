public class AlternatingRectanglesOf_OAnd_X {

    static void fill0X(int m, int n) {
        int rowstart = 0, colstart = 0, col = n, row = m;
        char[][] matrix = new char[m][n];
        char set_character = 'X';

        while(colstart < col && rowstart < row) {
            // Set left column.
            for(int i = rowstart; i < row; i++) {
                matrix[i][colstart] = set_character;
            }
            colstart++;
            
            //Set top rows.
            for(int i = colstart; i < col; i++) {
                matrix[rowstart][i] = set_character;
            }
            rowstart++;
            
            //Set right columns.
            if(rowstart < row) {
                for(int i = row-1; i >= rowstart; i--) {
                    matrix[i][col-1] = set_character;
                }
            }
            col--;

            //Set bottom rows.
            if(colstart < col) {
                for(int i = col-1; i >= colstart; i--) {
                    matrix[row-1][i] = set_character;
                }
            }
            row--;

            //Flip the character after every iteration.
            set_character = (set_character == 'X') ? 'O' : 'X';
        }

        //print the matrix.
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Output for m = 5, n = 6");
        fill0X(5, 6);

        System.out.println("Output for m = 4, n = 4");
        fill0X(4, 4);

        System.out.println("Output for m = 3, n = 4");
        fill0X(3, 4);

    }
}
