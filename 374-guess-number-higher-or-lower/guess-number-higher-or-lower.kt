/** 
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */

class Solution:GuessGame() {
    override fun guessNumber(n:Int):Int {
        var left = 1
        var right = n

        while(left <= right) {
            val mid = left + (right - left) / 2
            val res = guess(mid)
            if (res == 0) return mid
            else if (res > 0) left = mid + 1
            else right = mid - 1
        }
        return n
    }
}