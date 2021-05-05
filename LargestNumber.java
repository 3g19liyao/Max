package LiKou;

public class LargestNumber {
    public static void main(String[] args) {
        //System.out.println(compare(9,30));
        System.out.println(largestNumber(new int[]{3,31,30,4,432,43243}));
    }

    public static String largestNumber(int[] nums) {
        sortNum(nums);
        StringBuilder builder = new StringBuilder();
        for(int n : nums){
            System.out.print(n+"  ");
            builder.append(n);
        }
        if(builder.charAt(0) == '0'){
            return "0";
        }
        return String.valueOf(builder);
    }

    public static void sortNum(int[] nums){
        int len = nums.length;
        int[] res = new int[5];
        for(int i = 0;i < len-1;i++){
            for(int j = 0;j < len-1-i;j++){
                if(!compare(nums[j],nums[j + 1])){
                    int t = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = t;
                }
            }
        }
    }

    private static boolean compare(int num, int num1) {
        String str1 = String.valueOf(num);
        String str2 = String.valueOf(num1);
        StringBuilder builder = new StringBuilder();
        builder.append(str1).append(str2);
        StringBuilder builder1 = new StringBuilder();
        builder1.append(str2).append(str1);
        System.out.println(builder+".."+builder1+"..."+builder.toString().compareTo(builder1.toString()));
        return builder.toString().compareTo(builder1.toString()) > 0;
    }

}
