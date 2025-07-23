class Solution {
    fun fib(n: Int): Int {
        var first = 0
        var second = 1
        if (n == 0) return 0
        if (n == 1) return 1

        var num = 2
        var fib = first + second
        while (num != n + 1) {
            fib = first + second
            first = second
            second = fib
            num ++
        }

        return fib
    }
}