package leetcode

fun main() {
    println(longestPalindrome("ac"))
}
/*
* 中心扩展法，需要注意的是中心位置有可能是1个元素，有可能是2个元素
* */
fun longestPalindrome(s: String): String {
    if(s.isEmpty() || s.length == 0){
        return ""
    }
    val len = s.length
    var res = s[0].toString()
    var max = 1
    for (i in 0 until len){
        var temp = 1
        if(i + 1 < len && s[i] == s[i + 1]){
            var num = 2
            while (i - temp >= 0 && i + 1 + temp < len){
                if(s[i - temp] == s[i + 1 + temp]){
                    num += 2
                    temp++
                }else{
                    break
                }
            }
            res = if(max > num) res else s.substring(i - num/2 + 1,i + num / 2 + 1)
            max = Math.max(max,num)
        }
        temp = 1
        var num = 1
        while (i - temp >= 0 && i + temp < len){
            if(s[i - temp] == s[i + temp]){
                num += 2
                temp++
            }else{
                break
            }
        }
        res = if(max > num) res else s.substring(i - temp + 1,i + temp)
        max = Math.max(max,num)
    }
    println(max)
    return res
}