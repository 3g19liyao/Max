package leetcode

fun main() {
    println(longestCommonPrefix(arrayOf("cir","car")))
}

/*
*
* */

fun longestCommonPrefix(strs: Array<String>): String {
    var res = ""
    for(i in 0 until strs[0].length){
        var s = strs[0][i]
        var flag = 1
        for (str in strs){
            if(i >= str.length || str[i] != s){
                flag = 0
                break
            }
        }
        if (flag == 1){
            res += s
        }else{
            break
        }
    }
    return res
}