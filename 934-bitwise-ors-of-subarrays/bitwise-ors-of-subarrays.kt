class Solution {

    fun subarrayBitwiseORs(arr: IntArray): Int {
        val unique = HashSet<Int>()
        var prev = HashSet<Int>()
        for (num in arr) {
            prev.add(0) // Adding 0 since (0 OR x) => x which is one of the base.
            var current = HashSet<Int>()
            for (prevComputed in prev) {
                current.add(prevComputed or num)
                unique.add(prevComputed or num)
            }
            prev = current
        }
        return unique.size
    }
}