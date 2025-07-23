/**
 * Example:
 * var ti = Node(5)
 * var v = ti.`val`
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var next: Node? = null
 *     var random: Node? = null
 * }
 */

class Solution {
    fun copyRandomList(node: Node?): Node? {
        val nodesMap = hashMapOf<Node, Node>()

        var head = node
        return createOrGetNode(nodesMap, node)
    }

    fun createOrGetNode(nodesMap: HashMap<Node, Node>, from: Node?): Node? {
        if (from == null) return null
        nodesMap.getOrDefault(from, null)?.let {
            return it
        }
        
        val newNode = Node(from.`val`)
        nodesMap[from] = newNode
        
        newNode.next = createOrGetNode(nodesMap, from.next)
        newNode.random = createOrGetNode(nodesMap, from.random)
        
        return newNode
    }
}