package LiKou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PondSizes {
    public static void main(String[] args) {
        int[][] land = {
                {1,7,0,9},
                {1,0,7,6},
                {0,4,0,5},
                {0,1,5,0},
                {0,6,9,7},
                {1,0,5,2},
        };
        int[] arr = pondSizes(land);
        Arrays.sort(arr);
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+"   ");
        }
    }
    public static int[] pondSizes(int[][] land) {
        int len1 = land.length;
        int len2 = land[0].length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < len1;i++){
            for(int j = 0;j < len2;j++){
                if(land[i][j] == 0){
                    land[i][j] = 1;
                    int num = dfs(land,i,j,len1,len2,1);
                    list.add(num);
                }
            }
        }
        int[] res = new int[list.size()];
        for(int i =0 ;i < list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }

    private static int dfs(int[][] land,int i,int j,int len1,int len2,int num) {
        if(i + 1 < len1 && land[i+1][j] == 0){
            land[i+1][j] = 1;
            num = dfs(land,i+1,j,len1,len2,++num);
        }
        if(j + 1 < len2 && land[i][j+1] == 0){
            land[i][j+1] = 1;

            num = dfs(land,i,j+1,len1,len2,++num);
        }
        if(j + 1 < len2 && i + 1 < len1 && land[i+1][j+1] == 0){
            System.out.println(i+".."+j);
            land[i+1][j+1] = 1;
            num = dfs(land,i+1,j+1,len1,len2,++num);
        }
        if(i - 1 >= 0 && land[i-1][j] == 0){
            land[i-1][j] = 1;
            num = dfs(land,i-1,j,len1,len2,++num);
        }
        if(j - 1 >= 0 && land[i][j-1] == 0){
            land[i][j-1] = 1;
            num = dfs(land,i,j-1,len1,len2,++num);
        }
        if(i - 1 >= 0 && j - 1 >= 0 && land[i-1][j-1] == 0){
            land[i-1][j-1] = 1;
            num = dfs(land,i-1,j-1,len1,len2,++num);
        }
        if(i - 1 >= 0 && j + 1 < len2 && land[i-1][j+1] == 0){
            land[i-1][j+1] = 1;
            num = dfs(land,i-1,j+1,len1,len2,++num);
        }
        if(j - 1 >= 0 && i + 1 < len1 && land[i+1][j-1] == 0){
            land[i+1][j-1] = 1;
            num = dfs(land,i+1,j-1,len1,len2,++num);
        }
        return num;
    }

}
