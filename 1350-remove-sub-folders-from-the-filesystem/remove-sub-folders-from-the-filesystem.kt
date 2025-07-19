class Solution {
    fun removeSubfolders(folder: Array<String>): List<String> {
        val k = folder.sorted() // Step 1: Sort the folders
        var temp = k[0]         // Step 2: Initialize temp to the first folder
        val ans = mutableListOf(temp) // Add the first folder to the result list
        for(i in 1 until k.size) {
            if(!k[i].contains(temp)) { // If it's not a subfolder
                temp = k[i]            // Update temp to the new base folder
                ans.add(temp)          // Add the new base folder to the result
            } else {
                if(!k[i].startsWith("$temp/")) { // If it starts differently, add it
                    temp = k[i]
                    ans.add(temp)
                }
            }
        }
        return ans
    }
}