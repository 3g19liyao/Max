package LiKou;

import java.util.ArrayList;
import java.util.List;

public class 找到所有数组中消失的数字448 {
    public static void main(String[] args) {

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            arr[nums[i] - 1]++;
        }
        for(int i = 0;i < nums.length;i++){
            if(arr[i] == 0){
                list.add(i+1);
            }
        }
        return list;
    }

    /*   优化题解
    * 用一个哈希表记录数组 \textit{nums}nums 中的数字，由于数字范围均在 [1,n][1,n] 中，记录数字后我们再利用哈希表检查 [1,n][1,n] 中的每一个数是否出现，从而找到缺失的数字。
    * 遍历 \textit{nums}nums，每遇到一个数 xx，就让 \textit{nums}[x-1]nums[x−1] 增加 nn。由于 \textit{nums}nums 中所有数均在 [1,n][1,n] 中，
    * 增加以后，这些数必然大于 nn。最后我们遍历 \textit{nums}nums，若 \textit{nums}[i]nums[i] 未大于 nn，就说明没有遇到过数 i+1i+1。这样我们就找到了缺失的数字。
    * */
    public List<Integer> findDisappearedNumbers1(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % n;
            nums[x] += n;
        }
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;
    }

}
