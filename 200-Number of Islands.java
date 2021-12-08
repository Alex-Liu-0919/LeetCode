class Solution {
    public int numIslands(char[][] grid) {
        int countIsland = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j =0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    countIsland++;
                    changeLandToWater(grid,i,j);
                }
            }
        }
        return countIsland;
    }
    
    private void changeLandToWater(char[][] grid,int i, int j)
    {
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0')
        {
            return;
        }
        grid[i][j]='0';
        changeLandToWater(grid,i-1,j);
        changeLandToWater(grid,i+1,j);
        changeLandToWater(grid,i,j-1);
        changeLandToWater(grid,i,j+1);
    }
}

// grid[i][j]=='0'-- should be in the last, or else you will get boundry error!
// there is another method---BFS, go for it
