package LiKou;

public class 只出现一次的数字II137 {

    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        int once = 0;
        int twice = 0;
        for (int num : nums){
            once = (~twice) & (once ^ num);
            twice = (~once) & (twice ^ num);
        }
        return once;
    }

}
/*
            1:   1  0
            2:   0  1
            3:   0  0
*           seen_once = (~seen_twice） & (seen_once ^ num)
            seen_twice = (~seen_once） & (seen_twice ^ num)
            第一次出现时，once和twice均为0，once^num相当于把num添加到once，表示num出现了一次，~once表示不把num添加到twice；
            第二次出现时，num已经添加到once了，num^num=0，once=0，相当于将num从once中删除，twice^num相当于把num添加到twice中；
            第三次出现时，第二次的twice为1，~twice为0，所以once依然为0，第三次的twice=num^num=0，相当于把num从twice中删除；
            这道题遍历结果：出现一次的num对应的once为1，twice为0；出现三次的num对应的once为0，twice也为0。 最终只需要返回once就行。
*/


