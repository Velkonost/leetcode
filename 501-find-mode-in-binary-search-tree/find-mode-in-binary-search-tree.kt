/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun findMode(root: TreeNode?): IntArray {
        val map = hashMapOf<Int, Int>()

        fun calc(node: TreeNode?) {
            node?.let {
                map[it.`val`] = map.getOrDefault(it.`val`, 0) + 1
                calc(it.left)
                calc(it.right)
            }
        }
        calc(root)
        val max = map.values.max()
        return map.entries.filter { it.value == max }.map { it.key }.toIntArray()
    }
}