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
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var newHead = head
        
        while(newHead != null && newHead?.`val` == `val`) {
            newHead = newHead?.next
        }
        if (newHead == null) return null
        var prev = newHead
        var current = newHead?.next

        while(current != null) {
            if (current.`val` == `val`) {
                prev?.next = current?.next
                current = current?.next
            } else {
                prev = current
                current = current?.next
            }
        }

        return newHead
    }
}