class Solution {
    fun deleteDuplicateFolder(paths: List<List<String>>): List<List<String>> {
        val root = Node("")
        buildTree(root, paths)

        val contentOccurences = mutableMapOf<String, Int>()
        buildContent(root, contentOccurences)
        System.out.println(contentOccurences.entries.joinToString())

        val output = mutableListOf<List<String>>()
        buildOutput(root, emptyList(), contentOccurences, output)
        return output
    }

    private fun buildTree(root: Node, paths: List<List<String>>) {
      paths.forEach { path ->
        var curr = root
        path.forEach { filename ->
          curr = curr.children.find { it.name == filename } ?: 
          Node(filename).also{ curr.children.add(it) }
        }
      }
    }

    private fun buildContent(root: Node, occurenceMap: MutableMap<String, Int>): String {
      val sep = ";"
      val dirSep = "/"
      if (root.children.isEmpty()) {
        return root.name + dirSep
      }
      val content = root.children
                        .sortedBy { it.name } 
                        .map { buildContent(it, occurenceMap) }
                        .joinToString(sep)
      occurenceMap[content] = (occurenceMap[content] ?: 0) + 1
      root.content = content
      return "${root.name}$dirSep${root.children.size}$content"
    }

    private fun buildOutput(root: Node,
     currList: List<String>,
     occurenceMap: Map<String, Int>,
     output: MutableList<List<String>>) {
      val isRootOfDir = root.name.isEmpty()
      val appendedList = if (isRootOfDir) currList else currList.plus(root.name)
      if (!isRootOfDir) {
        output.add(appendedList)
      }

      root.children
          .filter { it.content.isEmpty() || occurenceMap[it.content] == 1}
          .forEach {
            buildOutput(it, appendedList, occurenceMap, output)
          }
    }
}

data class Node(val name: String, var content: String = "", val children: MutableList<Node> = mutableListOf())