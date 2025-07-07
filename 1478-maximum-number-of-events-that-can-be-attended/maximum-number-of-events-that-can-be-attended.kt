class Solution {
    fun maxEvents(events: Array<IntArray>): Int {
        events.sortBy { it[0] }
        val queue = PriorityQueue<IntArray>(compareBy { it[1] })
        var res = 0

        val min = events[0][0]
        val max = events.last()[1]

        var day = min
        var i = 0

        fun enqueue() {
            while(i < events.size && events[i][0] <= day) {
                queue.add(events[i])
                i ++
            }
        }

        fun dequeue() {
            while (queue.isNotEmpty()) {
                val event = queue.poll()
                if (day <= event[1]) {
                    res ++ 
                    day ++
                    enqueue()
                }
            }
        }

        enqueue()

        while (i < events.size && day <= max) {
            dequeue()
            if (i < events.size) {
                day = max(day, events[i][0])
                enqueue()
            }
        }

        dequeue()
        return res
    }
}