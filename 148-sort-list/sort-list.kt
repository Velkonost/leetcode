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
    fun sortList(head: ListNode?): ListNode? {
        val list = mutableListOf<ListNode>()
        var node = head

        while(node != null) {
            list.add(node)
            node = node.next
        }
        quickS(list, 0, list.size - 1)
        
        for (i in 0 until list.size) {
            list[i].next = list.getOrNull(i + 1)
        }
        list.map {
            println("${it.`val`} | ${it.next?.`val`}")
        }
        return list.firstOrNull()
    }

    fun quickS(list: MutableList<ListNode>, start: Int, end: Int) {
        if (start >= end) return

        var left = start 
        var right = end
        var pivot = left - (left - right) / 2
        while (left < right) {
            while(left < pivot && list[left].`val` <= list[pivot].`val`) {
                left ++
            }
            while(right > pivot && list[pivot].`val` <= list[right].`val`) {
                right --
            }

            if(left < right) {
                // val temp = list[left].next
                // list[left].next = list[right].next
                // list[right].next = temp

                val temp1 = list[left]
                list[left] = list[right]
                list[right] = temp1
                when {
                    left == pivot -> pivot = right
                    right == pivot -> pivot = left
                }
            }
        }
        quickS(list, start, pivot)
        quickS(list, pivot + 1, end)
    }
}