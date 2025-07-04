class Solution {
    fun minimumOperations(nums: IntArray): Int {
        val list = nums.toMutableList()
        val map = hashMapOf<Int, Int>()
        nums.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }

        var index = 0
        var res = 0
        while (index < list.size) {
            if (map[list[index]]!! > 1) {
                res ++
                repeat(3) {
                    if (list.isEmpty()) return@repeat
                    val value = list.removeAt(0)
                    map[value] = map[value]!! - 1
                    if (map[value] == 0) map.remove(value)
                }
                index = 0
            } else index ++
        }
        return res
    }
}