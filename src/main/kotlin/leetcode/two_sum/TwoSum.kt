package leetcode.two_sum

// https://leetcode.com/problems/two-sum/

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val complementIndex = mutableMapOf<Int, Int>()

        nums.forEachIndexed { index, v ->
            val complement = target - v

            if (complementIndex.containsKey(complement)) {
                return intArrayOf(complementIndex.getValue(complement), index)
            }

            complementIndex[v] = index
        }

        throw IllegalArgumentException("valid answer not exist ($nums) ($target)")
    }
}