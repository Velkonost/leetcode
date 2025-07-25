class Solution {
    fun constructRectangle(area: Int): IntArray {
        var width = sqrt(area.toDouble()).toInt()
        while(area % width != 0) {
            width --
        }
        val length = area / width
        return intArrayOf(length, width)
    }
}