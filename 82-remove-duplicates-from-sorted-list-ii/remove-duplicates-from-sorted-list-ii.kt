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
    fun deleteDuplicates(head: ListNode?): ListNode? {
        val newHead = ListNode(0)
        newHead.next = head

        var prevNode: ListNode? = newHead
        var current = head
        while (current != null) {
            if (current.next != null && current.`val` == current.next.`val`) {
                while (current?.next != null && current.`val` == current.next?.`val`) {
                    current = current.next
                }
                prevNode?.next = current?.next
                // current.next = current.next.next
            } else {
                prevNode = prevNode?.next
            }
            current = current?.next
            
        }
        return newHead.next
    }
}