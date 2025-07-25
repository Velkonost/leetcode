class Solution {
    fun numberToWords(num: Int): String {
        if (num == 0) {
            return "Zero"
        }
        
        return helper(num)
    }
    
    private fun lessTwenty(num: Int): String {
        return when(num) {
            1 -> "One"
            2 -> "Two"
            3 -> "Three"
            4 -> "Four"
            5 -> "Five"
            6 -> "Six"
            7 -> "Seven"
            8 -> "Eight"
            9 -> "Nine"
            10 -> "Ten"
            11 -> "Eleven"
            12 -> "Twelve"
            13 -> "Thirteen"
            14 -> "Fourteen"
            15 -> "Fifteen"
            16 -> "Sixteen"
            17 -> "Seventeen"
            18 -> "Eighteen"
            19 -> "Nineteen"
            else -> ""
        }
    }
    
    private fun tens(num: Int): String {
        return when(num) {
            20 -> "Twenty"
            30 -> "Thirty"
            40 -> "Forty"
            50 -> "Fifty"
            60 -> "Sixty"
            70 -> "Seventy"
            80 -> "Eighty"
            90 -> "Ninety"
            else -> ""
        }
    }
    
    private fun helper(num: Int): String {
        var ans = "" // Kotlin uses StringBuilder under the hood
        
        if (num >= 1_000_000_000) {
            ans += helper(num / 1_000_000_000) + " Billion " + helper(num % 1_000_000_000)
        } else if (num >= 1_000_000) {
            ans += helper(num / 1_000_000) + " Million " + helper(num % 1_000_000)
        } else if (num >= 1_000) {
            ans += helper(num / 1_000) + " Thousand " + helper(num % 1_000)
        } else if (num >= 100) {
            ans += helper(num / 100) + " Hundred " + helper(num % 100)
        } else if (num >= 20) {
            ans += tens(num - (num % 10)) + " " + lessTwenty(num % 10)
        } else if (num < 20) {
            ans += lessTwenty(num)
        }
        
        return ans.trim()
    }
}