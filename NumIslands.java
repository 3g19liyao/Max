package LiKou;

public class NumIslands {
    public static void main(String[] args) {
        
    }
    public static int numIslands(char[][] grid) {
        int len1 = grid.length;
        int len2 = grid[0].length;
        int res = 0;
        for(int i = 0;i < len1;i++){
            for(int j = 0;j < len2;j++){
                if(i == 0 && j == 0 && grid[i][j] == 1){
                    res++;
                }else if(i == 0 && j != 0){
                    if(grid[i][j-1] == 0 && grid[i][j] == 1){
                        res++;
                    }
                }else if(i != 0 && j == 0){
                    if(grid[i-1][j] == 0 && grid[i][j] == 1){
                        res++;
                    }
                }else if(i != 0 && j != 0){
                    if(grid[i][j] == 1 && grid[i][j-1] == 0 && grid[i-1][j] == 0){
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
