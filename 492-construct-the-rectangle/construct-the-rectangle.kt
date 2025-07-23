class Solution {
    fun constructRectangle(area: Int): IntArray {
        var minDist = Integer.MAX_VALUE
        var length = area
        var width = 1
        val half = area / 2
        for (i in 1..area) {
            var nL = i
            if (area % nL == 0) {
                var nW = area / nL
                if (nL >= nW && abs(nL - nW) < minDist) {
                    minDist = abs(nL - nW)
                    width = nW
                    length = nL
                }
            }
        }

        return intArrayOf(length, width)
    }
}