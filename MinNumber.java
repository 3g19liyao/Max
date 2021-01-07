package LiKou;

public class MinNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{};
        System.out.println(minNumber(nums));
    }
    public static String minNumber(int[] nums){
        int len = nums.length;
        String[] str = new String[len];
        String temp;
        for(int i = 0;i < len;i++){
            str[i] = String.valueOf(nums[i]);
        }
        for(int i = 0;i < len;i++){
            for(int j = 0;j < len-i-1;j++){
                if(Integer.valueOf(str[j]+str[j+1]) > Integer.valueOf(str[j+1]+str[j])){
                    temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for(String s:str)
            result.append(s);
        return result.toString();
    }
}
