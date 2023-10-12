import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < 9;i++){
            for (int j = 0 ; j < 9;j++){
                char currentValue = board[i][j];
                if(currentValue == '.' ){
                    continue;
                }
                if (!seen.add(currentValue + " found in row " + i) ||
                    !seen.add(currentValue + " found in column " + j) ||
                    !seen.add(currentValue + " found in grid " + i/3 + "-" + j/3)
                ) return false;
            }
        }
        return true;


    }
}
