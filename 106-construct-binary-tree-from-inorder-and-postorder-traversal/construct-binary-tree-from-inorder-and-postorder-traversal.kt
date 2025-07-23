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
 // inorder - left tree - root - right tree
 // postorder - left tree - right tree - root
class Solution {
    fun buildTree(inorder: IntArray, postorder: IntArray): TreeNode? {
        val inorderMap = mutableMapOf<Int, Int>()

        for (i in inorder.indices) {
            inorderMap[inorder[i]] = i
        }
        
        fun buildSubTree(start: Int, end: Int, postOrderStart: Int, postOrderEnd: Int): TreeNode? {
            if (end < start) return null
            if (start == end) return TreeNode(inorder[start])

            val postOrderValue = postorder[postOrderEnd]
            val rootIndexInInorder = inorderMap[postOrderValue]!!
            val node = TreeNode(postOrderValue)

            node.left = buildSubTree(
                start, rootIndexInInorder - 1,
                postOrderStart, postOrderStart + (rootIndexInInorder - 1 - start)
                
            )
            node.right = buildSubTree(
                rootIndexInInorder + 1, end,
                postOrderStart + (rootIndexInInorder - start), postOrderEnd - 1
            )

            return node
        }

        return buildSubTree(0, inorder.size - 1, 0, postorder.size - 1)
    }
}