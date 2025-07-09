class Solution {
    fun maxFreeTime(eventTime: Int, k: Int, startTime: IntArray, endTime: IntArray): Int {

        val listGap = IntArray(startTime.size+1)
        var lastEnd = 0
        for(i in 0 until startTime.size){
            listGap[i] = startTime[i]-lastEnd
            lastEnd = endTime[i]
        }
        listGap[startTime.size] = (eventTime - lastEnd)

        var left = 0
        var windowGap = 0
        for(i in left..k) {
            windowGap += listGap[i]
        }
        var maxGap = windowGap

        for(i in (k+1) until listGap.size) {
            windowGap += listGap[i] - listGap[left]
            left++
            maxGap = max(maxGap, windowGap)
        }
        
        return maxGap
    }
}