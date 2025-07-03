class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val result = mutableListOf<String>()
        for (i in 1..n) {
            val divisibleBy3 = i % 3 == 0
            val divisibleBy5 = i % 5 == 0
            
            when {
                divisibleBy3 && divisibleBy5 -> result.add("FizzBuzz")
                divisibleBy3 -> result.add("Fizz")
                divisibleBy5 -> result.add("Buzz")
                else -> result.add(i.toString())
            }
        }
        return result
    }
}