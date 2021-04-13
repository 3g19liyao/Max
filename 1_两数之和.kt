package leetcode

/*给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。*/

fun main() {
    val abc = twoSum(intArrayOf(1,2,3,4,5),8)
    println(abc[0])
    println(abc[1])
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val arr = IntArray(2)
    val len = nums.size
    for (i in 0 until len){
        for (j in i+1 until len){
            if((nums[i] + nums[j]) == target){
                arr[0] = i
                arr[1] = j

            }
        }
    }
    return arr
}