package leetcode

fun main() {
    println(lengthOfLongestSubstring(""))

}

fun lengthOfLongestSubstring(s: String): Int {
    var res = 0
    var start = 0
    for (end in 0 until s.length){
        println("$start..$end")
        if(s.substring(start,end).contains(s[end])){
            start = s.substring(0,end).lastIndexOf(s[end]) + 1
            println("$start....")
            res = Math.max(res,end - start)
        }else{
            res = Math.max(res,end - start + 1)
        }
        println(res)
    }
    return res
}