class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Valdiate Row
        boolean rows = validateRows(board);
        if(!rows) return false;
        // Validate Column
        boolean column = validateColumn(board);
        if(!column) return false;
        // Validate Squares
        boolean sqaure = validateSquares(board);
        return sqaure;
    }

    private boolean validateRows(char[][] board){
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
            Set<Character> nums = new HashSet<>();
            for(int j=0;j<n;j++){
                if(board[i][j] == '.') continue;
                if(nums.contains(board[i][j])) return false;
                nums.add(board[i][j]);
            }
        }

        return true;
    }

    private boolean validateColumn(char[][] board){
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<n;i++){
            Set<Character> nums = new HashSet<>();
            for(int j=0;j<m;j++){
                if(board[j][i] == '.') continue;
                if(nums.contains(board[j][i])) return false;
                nums.add(board[j][i]);
            }
        }
        
        return true;
    }


    private boolean validateSquares(char[][] board){
        int m = board.length;
        int n = board[0].length;

        for(int i=0;i<m;i+=3){
            
            for(int j=0;j<m;j+=3){
                Set<Character> nums = new HashSet<>();
                for(int row = i; row<i+3;row++){
                    for(int col = j;col<j+3;col++){
                        if(board[row][col] == '.') continue;
                        if(nums.contains(board[row][col])) return false;
                        nums.add(board[row][col]);
                    }
                }
            }
        }

        return true;
    }

}
