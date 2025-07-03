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
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        return search(root, 0, false)
    }

    fun search(
        node: TreeNode?,
        amount: Int,
        isLeft: Boolean
    ): Int {
        if (node == null) return amount
        if (node.left == null && node.right == null) {
            return if (isLeft) amount + node.`val` else amount
        }
        val leftAmount = search(node.left, amount, true)
        val rightAmount = search(node.right, amount, false)
        return leftAmount + rightAmount
    }
}