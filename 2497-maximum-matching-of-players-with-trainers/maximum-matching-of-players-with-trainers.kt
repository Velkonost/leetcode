class Solution {
    fun matchPlayersAndTrainers(players: IntArray, trainers: IntArray): Int {
        players.sort()
        trainers.sort()

        var i = 0
        var j = 0
        var res = 0
        while (i < players.size && j < trainers.size) {
            if (players[i] <= trainers[j]) {
                res ++
                i ++
                j ++
            } else if (players[i] > trainers[j]) {
                j ++
            } else i ++
        }
        return res
    }
}