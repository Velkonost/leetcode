class Solution {
    fun matchPlayersAndTrainers(players: IntArray, trainers: IntArray): Int {
        val sortedPlayers = players.sorted()
        val sortedTrainers = trainers.sorted()

        var i = 0
        var j = 0
        var res = 0
        while (i < players.size && j < trainers.size) {
            if (sortedPlayers[i] <= sortedTrainers[j]) {
                res ++
                i ++
                j ++
            } else if (sortedPlayers[i] > sortedTrainers[j]) {
                j ++
            } else i ++
        }
        return res
    }
}