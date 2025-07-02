class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.isEmpty()) {
            return true
        }

        if (t.isEmpty()) {
            return false
        }

        var currentIndexOfS = -1

        for (i in 0..t.length - 1) {
            if (t[i] == s[currentIndexOfS + 1]) {
                // println("qq")
                currentIndexOfS ++
                
                if (currentIndexOfS == s.length - 1) {
                    return true
                }

            }
        }

        return currentIndexOfS == s.length - 1
    }
}