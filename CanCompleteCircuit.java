package LiKou;

public class CanCompleteCircuit {
    public static void main(String[] args) {
        int[] gas = new int[]{1,2,3,4,5};
        int[] cost = new int[]{3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int g = 0;
        int result = -1;
        for(int i = 0;i < len;i++){
            int flag = 0;
            for(int j = i;j < i + len;j++){
                int temp = 0;
                if(j >= len){
                    temp = 1;
                    j -= len;
                }
                g += gas[j];
                g -= cost[j];
                System.out.println(i+"..."+j+"..."+g);
                if(g < 0){
                    flag = 1;
                    g = 0;
                    break;
                }
                if(temp == 1) {
                    j += len;
                }
            }
            if(flag == 0){
                result = i;
                break;
            }
        }
        return result;
    }
}
