package leetcode

fun main() {
    println(maxArea(intArrayOf(1,5,1)))
}
/*
* 从两边向中间收缩，由于盛水容积按高度小的决定，所以每次让高度小的往中间靠，如果两边一样，则同时往中间
* */
fun maxArea(height: IntArray): Int {
    var start = 0
    var end = height.size - 1
    var high = 0
    var res = 0
    while(start < end){
        high = if(height[start] > height[end]) height[end] else height[start]
        res = Math.max(res,high * (end - start))
        if(height[start] > height[end]){
            end--
        }else if(height[start] < height[end]){
            start++
        }else{
            start++
            end--
        }
    }
    return res
}