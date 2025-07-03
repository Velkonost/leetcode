class Solution {
       fun findContentChildren(g: IntArray, s: IntArray): Int {
        g.sort()
        s.sort()
        
        var gPointer = 0
        var sPointer = 0
        while (gPointer < g.size && sPointer < s.size) {
            if (g[gPointer] <= s[sPointer++]) gPointer ++
        }

        return gPointer
    }
}