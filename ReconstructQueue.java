package LiKou;

import java.util.LinkedList;

public class ReconstructQueue {
    public static void main(String[] args) {

    }
    public static int[][] reconstructQueue(int[][] people){
        int len=people.length;
        for(int i=0;i<len-1;i++) {
            for(int j=i+1;j<len;j++) {
                if(people[i][0]<people[j][0]) {
                    int t=people[i][0];
                    int t1=people[i][1];
                    people[i][0]=people[j][0];
                    people[i][1]=people[j][1];
                    people[j][0]=t;
                    people[j][1]=t1;
                }else if(people[i][0]==people[j][0]){
                    if(people[i][1]>people[j][1]) {
                        int t=people[i][0];
                        int t1=people[i][1];
                        people[i][0]=people[j][0];
                        people[i][1]=people[j][1];
                        people[j][0]=t;
                        people[j][1]=t1;
                    }
                }
            }
        }
        LinkedList<int[]> list = new LinkedList<>();
        for (int[] p : people) {
            list.add(p[1], p);
        }
        return list.toArray(new int[len][2]);
    }
}
