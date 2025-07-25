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
    fun insertionSortList(head: ListNode?): ListNode? {
        
        if (head == null){
            return null
        }
        
        var newHead = ListNode(head.`val`)
        var node = head?.next
        var current: ListNode? = head?.next

        while (current != null) {
            node = ListNode(current.`val`)

            if (node.`val` < newHead!!.`val`) {
                node.next = newHead
                newHead = node

                current = current?.next
                continue
            }

            var target = newHead
            while(target != null) {
                if (target.next == null || target.next!!.`val` > node.`val`) {
                    // node.next = target.next
                    // target.next = node
                      val temp = target.next
                    target.next = node
                    node.next = temp
                    break
                }
                target = target.next
            }

            current = current.next

        }
        return newHead
    }
}