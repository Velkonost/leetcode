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
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        val map = mutableMapOf<Int, Int>()

        for (i in inorder.indices) {
            map[inorder[i]] = i
        }

        var preorderIndex = 0

        fun buildSubTree(start: Int, end: Int): TreeNode? {
            if (end < start) return null

            val node = TreeNode(preorder[preorderIndex])
            val inorderIndex = map[node.`val`]!!

            preorderIndex ++

            node.left = buildSubTree(start, inorderIndex - 1)
            node.right = buildSubTree(inorderIndex + 1, end)
            

            return node
        }

        return buildSubTree(0, map.size - 1)
    }

    
}