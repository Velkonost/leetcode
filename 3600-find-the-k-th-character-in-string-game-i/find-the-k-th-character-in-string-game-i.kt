class Solution {
    fun kthCharacter(k: Int): Char {
        var word = "a"
        while(word.length < k) {
            var updatedWord = word
            for (char in word) {
                val nextChar = char + 1
                updatedWord += nextChar

                if (updatedWord.length > k) break
            }
            word = updatedWord
        }
        return word[k - 1]
    }
}