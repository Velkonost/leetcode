class Solution {
    fun findLucky(arr: IntArray): Int {
        val map = hashMapOf<Int, Int>()
        arr.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }
        val elig = map.entries.filter { it.key == it.value }
        
        if (elig.isEmpty()) return -1
        return elig.maxBy { it.key }.key
    }
}