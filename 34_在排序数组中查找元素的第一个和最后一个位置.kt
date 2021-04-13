package leetcode

fun main() {
    println(searchRange(intArrayOf(5),5)[0])
    println(searchRange(intArrayOf(5),5)[1])
}

fun searchRange(nums: IntArray, target: Int): IntArray {

    var left = 0
    var right = nums.size - 1
    if(nums[left] == target && nums[right] == target){
        return intArrayOf(left,right)
    }
    var num = -1
    while (left < right ){
        val mid = (right + left) / 2
        //print("$left  $right")
        if(nums[mid] < target){
            left = mid+1
            continue
        }else if (nums[mid] > target){
            right = mid-1
            continue
        }else{
            left = mid
            right = mid
            num = mid
            break
        }
    }
    while (left > 0 && nums[left - 1] == target){
        left--
    }
    while (right < nums.size - 1 && nums[right + 1] == target){
        right++
    }
    if(num == -1){
        return intArrayOf(-1,-1)
    }else{
        return intArrayOf(left,right)
    }


}