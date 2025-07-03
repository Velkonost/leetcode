class Solution {
    fun hammingDistance(x: Int, y: Int): Int {
        // println(x.toString(2))
        // println(y.toString(2))
        return (x xor y).toString(2).count { it == '1' }
    }
}

