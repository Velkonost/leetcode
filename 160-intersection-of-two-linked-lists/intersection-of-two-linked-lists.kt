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
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        val set = mutableSetOf<ListNode>()

        var currA: ListNode? = headA
        while(currA != null) {
            set.add(currA)
            currA = currA.next
        }

        var currB: ListNode? = headB
        while(currB != null) {
            if (set.contains(currB)) {
                return currB
            }
            currB = currB.next
        }
        return null
    }
}