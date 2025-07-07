/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
fun sumWithWeight(l1: ListNode?, l2: ListNode?, weight: Int = 0): ListNode? {
    val currentSum = (l1?.`val` ?: 0) + (l2?.`val` ?: 0) + weight
    val nextWeight = if (currentSum > 9) 1 else 0
    val reduceSum = if (currentSum > 9) 10 else 0

    return if (l1?.next != null || l2?.next != null) {
        val nextListNode = sumWithWeight(l1?.next, l2?.next, nextWeight)
        ListNode(currentSum - reduceSum).apply {
            next = nextListNode
        }
    } else {
        val nextListNode = if (currentSum > 9) ListNode(1) else null
        ListNode(currentSum - reduceSum).apply {
            next = nextListNode
        }
    }
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    return sumWithWeight(l1, l2)
}
}