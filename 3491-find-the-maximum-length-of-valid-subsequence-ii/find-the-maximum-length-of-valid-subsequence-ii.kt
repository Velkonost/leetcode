class Solution {
    
    fun solve(nums: IntArray, k: Int, t: Int): Int {
        var a: IntArray = IntArray(nums.size) {0};
        var index: IntArray = IntArray(2*k+1) {-1};
        var m: Int = 0;

        index[nums[0] % k] = 0;
        a[0] = 1;
        var rest = 0;

        for (i in 1 until nums.size) {
            rest = t - (nums[i] % k);
            index[nums[i] % k] = i;

            if (rest >= 0 && index[rest] != -1) {
                a[i] = a[index[rest]]+1;
                m = max(a[i], m);
            }
            else a[i] = 1;
        }
        return m;
    }
    
    fun maximumLength(nums: IntArray, k: Int): Int {
        if (nums.size == 2) return 2;
        var a: IntArray = IntArray(k) {0};
        for (i in 0 until nums.size) {
            a[nums[i] % k]++;
        }
        var m = 0;
        for (i in 0 until k)
            m = max(m, a[i]);
        for (i in 0..(2*k))
            m = max(m, solve(nums, k, i))
        return m;
    }
}