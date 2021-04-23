package leetcode

/*
* 回溯
* */
fun main() {
    println(letterCombinations("23"))
}

fun letterCombinations(digits: String): List<String> {
    val str = arrayOf("abc","def","ghi","jkl","mno","pqrs","tuv","wxyz")
    var list = mutableListOf<String>()
    for (i in 0 until digits.length){
        list = huisu(str[(digits[i] - 2).toString().toInt()],list)
    }
    return list
}

fun huisu(str: String,list: List<String>): MutableList<String> {
    val lists = mutableListOf<String>()
    if(!list.isEmpty()){
        for (i in 0 until list.size){
            for (j in 0 until str.length){
                lists.add(list[i] + str[j])
            }
        }
    }else{
        for (j in 0 until str.length){
            lists.add(str[j].toString())
        }
    }
    return lists
}