package leetcode

import java.util.*


fun main() {
    println(isValid("([]{})"))
}

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    for (c in s){
        if(c == '[' || c == '{' || c == '('){
            stack.push(c)
        }else{
            if(stack.empty()){
                return false
            }
            if (c == ']' && stack.pop() != '['){
                return false
            }else if (c == '}' && stack.pop() != '{'){
                return false
            }else if (c == ')' && stack.pop() != '('){
                return false
            }
        }
    }
    if(!stack.empty()){
        return false
    }
    return true
}