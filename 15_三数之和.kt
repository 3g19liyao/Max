package leetcode

import java.util.*
import kotlin.collections.ArrayList


fun main() {
    println(threeSum(intArrayOf(-1,0,1,2,-1,-4)))
}

/*
* 先排序，然后把第一个数字单拿出来，然后对后面所有数据进行判断，设定left和right双指针，判断>0还是<0，进行指针的迁移
* */

fun threeSum(nums: IntArray): List<List<Int>> {
    val array= arrayListOf<ArrayList<Int>>()
    if (nums.isEmpty()) {
        return array;
    }
    nums.sort()
    for (i in 0 until nums.size){
        if(nums[i] > 0){
            break
        }
        if(i > 0 && nums[i] == nums[i - 1]){
            continue
        }
        var left = i + 1
        var right = nums.size - 1
        while (left < right){
            if(right < nums.size - 1 && nums[right] == nums[right + 1] || nums[i] + nums[left] + nums[right] > 0){
                right--
            }else if (left > i + 1 && nums[left] == nums[left - 1] || nums[i] + nums[left] + nums[right] < 0){
                left++
            }else{
                array.add(arrayListOf(nums[i],nums[left++],nums[right--]))
            }
        }
    }
    return array

}