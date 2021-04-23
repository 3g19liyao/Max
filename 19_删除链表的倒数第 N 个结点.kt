package leetcode

fun main() {

}

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val newHead: ListNode = ListNode(0)
    newHead.next = head
    var node = newHead
    var ptr = newHead
    for (i in 0 until n){
        ptr = ptr.next!!
    }
    while (ptr.next != null){
        ptr = ptr.next!!
        node = node.next!!
    }
    node.next = node.next?.next
    return newHead.next
}


class ListNode(var value: Int) {
    var next: ListNode? = null
}