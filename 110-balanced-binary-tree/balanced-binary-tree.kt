class Solution {
    
    fun isBalanced(root: TreeNode?): Boolean {
        return checkDepth(root) != -1
    }
    
    private fun checkDepth(root: TreeNode?): Int {
        root ?: return 0
        val lDepth = checkDepth(root.left)
        val rDepth = checkDepth(root.right)
        val delta = abs(lDepth - rDepth)
        return when {
            lDepth == -1 ||
            rDepth == -1 ||
            abs(lDepth - rDepth) > 1 -> -1
            else -> 1 + maxOf(lDepth, rDepth)
        }
    }
}