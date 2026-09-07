class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0;i<board.length;i++){
           HashSet<Character> row=new HashSet<>();
            for(int j=0;j<board[0].length;j++){
    
                if(board[i][j]!='.' && row.contains(board[i][j])){
                    return false;
                }
                else if(board[i][j]!='.'){
                    row.add(board[i][j]);
                }
            }
        }
        for(int i=0;i<board[0].length;i++){
            HashSet<Character> col=new HashSet<>();
            for(int j=0;j<board.length;j++){
            if(board[j][i]!='.' && col.contains(board[j][i])){
                    return false;
                }
                 else if(board[j][i]!='.'){
                    col.add(board[j][i]);
                }
        }
    }
    for(int i=0;i<9;i+=3){
        for(int j=0;j<9;j+=3){
            HashSet<Character> box=new HashSet<>();
            for(int r=0;r<3;r++){
                for(int c=0;c<3;c++){
                    if(board[i+r][j+c]!='.' && box.contains(board[i+r][j+c])){
                        return false;
                    }
                    else if(board[i+r][j+c]!='.'){
                        box.add(board[i+r][j+c]);
                    }
                }
            }
        }
    }
    return  true;

}
}
