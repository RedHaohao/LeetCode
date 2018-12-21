//解题思路First, check the four border of the matrix. If there is a element is
'O', alter it and all its neighbor 'O' elements to '1'.

Then ,alter all the 'O' to 'X'

At last,alter all the '1' to 'O'

For example:

         X X X X           X X X X             X X X X
         X X O X  ->       X X O X    ->       X X X X
         X O X X           X 1 X X             X O X X
         X O X X           X 1 X X             X O X X

class Solution {
public:
    void solve(vector<vector<char>>& board) {
        
        int row=board.size();
        if(row==0)
            return;
        int col=board[0].size();

        for(int j=0;j<col;j++)
        {
            if(board[0][j]=='O')
            {
                check(board,0,j,row,col);
            }
            if(board[row-1][j]=='O')
            {
                 check(board,row-1,j,row,col);
            }
        }
        for(int i=1;i<row-1;i++)
        {
             if(board[i][0]=='O')
            {
                check(board,i,0,row,col);
            }
            if(board[i][col-1]=='O')
            {
                 check(board,i,col-1,row,col);
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(board[i][j]=='O')
                {  board[i][j]='X';    }
                if(board[i][j]=='1')
                {board[i][j]='O';}
            
            }
        }
        
    }
    	void check(vector<vector<char> >&vec,int i,int j,int row,int col){
		if(vec[i][j]=='O'){
			vec[i][j]='1';
			if(i>1)
				check(vec,i-1,j,row,col);
			if(j>1)
				check(vec,i,j-1,row,col);
			if(i+1<row)
				check(vec,i+1,j,row,col);
			if(j+1<col)
				check(vec,i,j+1,row,col);
		}
        }
};