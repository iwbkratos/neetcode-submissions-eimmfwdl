class Solution {
    public int count = 0;
    public int totalNQueens(int n) {
        int[][] mat = new int[n][n];
        queens(mat,0,n);
        return count;
    }

    private void queens(int[][] mat, int i, int n)
    {
        if(i == n)
        {
            count++;
            return;
        }
        for(int j=0; j<n; j++)
        {
            if(valid(mat,i,j,n))
            {
                mat[i][j] = 1;
                queens(mat,i+1,n);
                mat[i][j] = 0;
            }
        }
    }

    private boolean valid(int[][] mat, int i, int j, int n)
    {
        for(int x=i-1; x>=0; x--)
        {
            if(mat[x][j] == 1)
            {
                return false;
            }
        }

        for(int x=i-1, y=j-1; x>=0 && y>=0; x--,y--)
        {
            if(mat[x][y]==1)
            {
                return false;
            }
        }

        for(int x=i-1, y=j+1; x>=0 && y<n; x--,y++)
        {
            if(mat[x][y]==1)
            {
                return false;
            }
        }

        return true;
        
    }
}