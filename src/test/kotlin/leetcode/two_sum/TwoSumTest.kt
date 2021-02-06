package leetcode.two_sum

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class TwoSumTest {
    private val solution = Solution()

    @Test
    fun twoSum() {
        assertArrayEquals(intArrayOf(0, 1), solution.twoSum(intArrayOf(2, 7, 11, 15), target = 9))
    }
}