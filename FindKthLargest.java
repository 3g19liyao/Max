package LiKou;

import java.util.Random;

public class FindKthLargest {
    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4},2));
    }
    /*
    * [3,2,1,5,6,4]
        2
    * */
    static Random random = new Random();
    public static int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }                               //左边界0       右边界5           下标4
    public static int quickSelect(int[] a, int l, int r, int index) {
        int q = randomPartition(a, l, r);
        if (q == index) {
            return a[q];
        } else {
            return q < index ? quickSelect(a, q + 1, r, index) : quickSelect(a, l, q - 1, index);
        }
    }
    public static int randomPartition(int[] a, int l, int r) {
        int i = random.nextInt(r - l + 1) + l;// 0--5 +0,范围内随机下标
        swap(a, i, r);
        return partition(a, l, r);
    }
    public static int partition(int[] a, int l, int r) {
        int x = a[r], i = l - 1;
        System.out.println(x+"  *  "+i);
        for (int j = l; j < r; ++j) {
            if (a[j] <= x) {
                swap(a, ++i, j);
            }
        }
        swap(a, i + 1, r);
        return i + 1;
    }
    public static void swap(int[] a, int i, int j) {
        System.out.println(i+"   +   "+j);
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
