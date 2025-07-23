class Solution {
    fun findRelativeRanks(score: IntArray): Array<String> {
        val maxHeap = PriorityQueue<AthleteIndexAndScore>(score.size) { a, b ->
            b.score.compareTo(a.score)
        }

        score.forEachIndexed { index, athleteScore ->
            maxHeap.add(AthleteIndexAndScore(index, athleteScore))
        }

        val result = Array(score.size) { "" }
        var currentPosition = 1
        while (maxHeap.size > 0) {
            val top = maxHeap.poll()
            result[top.index] = getPositionDescription(currentPosition)
            currentPosition++
        }

        return result
    }
    
    private fun getPositionDescription(position: Int): String {
        return when (position) {
            1 -> "Gold Medal"
            2 -> "Silver Medal"
            3 -> "Bronze Medal"
            else -> position.toString()
        }
    }

    data class AthleteIndexAndScore(val index: Int, val score: Int)
}