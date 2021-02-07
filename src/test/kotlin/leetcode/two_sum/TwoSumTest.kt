package leetcode.two_sum

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.assertThrows

internal class TwoSumTest {
    private val solution = Solution()

    @Test
    fun leetcodeExampleTest() {
        assertArrayEquals(intArrayOf(0, 1), solution.twoSum(intArrayOf(2, 7, 11, 15), target = 9))
        assertArrayEquals(intArrayOf(1, 2), solution.twoSum(intArrayOf(3, 2, 4), target = 6))
        assertArrayEquals(intArrayOf(0, 1), solution.twoSum(intArrayOf(3, 3), target = 6))
    }

    @Test
    fun illegalInputTest() {
        assertThrows<IllegalArgumentException> ("Should throw an exception"){
            solution.twoSum(intArrayOf(2, 7), target = 1)
        }
    }
}