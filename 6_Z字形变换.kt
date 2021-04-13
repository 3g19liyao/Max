package leetcode

fun main() {
    println(convert("AB",1))
}
/*
* 找到规律，发现每一行，除以 2 * numRows - 2 的余数都与对应行的行号有关
*
* */
fun convert(s: String, numRows: Int): String {
    var res = ""
    val tab = 2 * numRows - 2
    if(tab <= 0){
        return s
    }
    for(i in 0 until tab/2 + 1){
        for(j in 0 until s.length){
            if((j + tab) % tab == i || (j + tab) % tab == tab - i){
                res += s[j]
            }
        }
    }
    return res
}