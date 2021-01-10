package LiKou;

public class Merge1 {
    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,3};
        int[] num2 = new int[]{2,5,6};
        merge(num1,3,num2,3);
        for(int i = 0 ; i < 6 ; i++){
            System.out.print(num1[i]+"    ");
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0){
            for(int i = 0 ; i< n ; i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        int len1 = m - 1;
        int len2 = n - 1;
        int len = m + n - 1;
        while(len1 >= 0 && len2 >= 0) {
            if(nums1[len1] > nums2[len2]){
                nums1[len--] = nums1[len1--];
            }else{
                nums1[len--] = nums2[len2--];
            }
        }
        // 表示将nums2数组从下标0位置开始，拷贝到nums1数组中，从下标0位置开始，长度为len2+1
        System.arraycopy(nums2, 0, nums1, 0, len2 + 1);
    }
}

