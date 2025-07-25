class Solution {
    fun sortColors(nums: IntArray): Unit {
        // quickS(nums)
        nums.bubbleSort()
    }

    fun IntArray.bubbleSort() {
        var sorted = false
        while(!sorted) {
            sorted = true
            for (i in 1..<this.size) {
                var prev = this[i - 1]
                var curr = this[i]
                if (curr < prev) {
                    this[i - 1] = this[i]
                    this[i] = prev
                    sorted = false
                }
            }
        }
    }

    fun IntArray.insertionSort() {
        for (i in 1..<this.size) {
            val key = this[i]
            var j = i - 1
            while (j >= 0 && this[j] > key) {
                this[j + 1] = this[j]
                j--
            }
            this[j + 1] = key
        }
    }

    fun quickS(list: IntArray, start: Int = 0, end: Int = list.size - 1) {
        if (start >= end) return
        var left = start
        var right = end
        var pivot = start - (start - end) / 2
        while(left < right) {
            while(left < pivot && list[left] <= list[pivot]) {
                left ++
            }
            while(right > pivot && list[right] >= list[pivot]) {
                right --
            }
            if (left < right) {
                val temp = list[left]
                list[left] = list[right]
                list[right] = temp

                when {
                    left == pivot -> pivot = right
                    right == pivot -> pivot = left
                }
            }
        }
        quickS(list, start, pivot)
        quickS(list, pivot + 1, end)
    }
}