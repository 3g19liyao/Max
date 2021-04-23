package leetcode

fun main() {
    println(threeSumClosest(intArrayOf(-1,2,1,-4),1))
}
/*
* 和三数之和做题方法一样
* */
fun threeSumClosest(nums: IntArray, target: Int): Int {
    var res = 0
    var instance = Int.MAX_VALUE
    nums.sort()
    for (i in 0 until nums.size-2){
        var left = i + 1
        var end = nums.size - 1
        if(i > 0 && nums[i] == nums[i - 1]){
            continue
        }
        while(left < end){
            val num = nums[i] + nums[left] + nums[end]
            if((end < nums.size - 1 && nums[end] == nums[end + 1]) || num > target){
                if (num - target < instance){
                    instance = num - target
                    res = num
                }
                end--
            }else if((left > i + 1 && nums[left] == nums[left - 1]) || num < target){
                if(target - num < instance){
                    instance = target - num
                    res = num
                }
                left++
            }else{
                return target
            }
        }
    }
    return res
}