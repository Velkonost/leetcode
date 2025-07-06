class FindSumPairs(val nums1: IntArray,val nums2: IntArray) {
    val map = HashMap<Int,Int>()
    init{
        nums2.forEach{

            map[it] = map.getOrDefault(it, 0) + 1
        }
    }
    fun add(index: Int, `val`: Int) {
        val num = nums2[index]
        map[num] = map[num]!! - 1
        nums2[index] += `val`
        map[nums2[index]] = map.getOrDefault(nums2[index], 0) + 1
    }

    fun count(tot: Int): Int {
        var res = 0
        nums1.forEach{
            if( map.containsKey(tot - it)) res+= map[tot - it]!!
        }

        return res
    }

}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * var obj = FindSumPairs(nums1, nums2)
 * obj.add(index,`val`)
 * var param_2 = obj.count(tot)
 */