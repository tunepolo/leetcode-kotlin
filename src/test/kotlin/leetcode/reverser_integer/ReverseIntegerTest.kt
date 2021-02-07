package leetcode.reverser_integer

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

internal class ReverseIntegerTest {
    private val solution = Solution()

    @Test
    fun leetcodeExampleTest() {
        assertEquals(321, solution.reverse(123))
        assertEquals(-321, solution.reverse(-123))
        assertEquals(21, solution.reverse(120))
        assertEquals(0, solution.reverse(0))

        // Bigger than threshold
        assertEquals(0, solution.reverse(1534236469))

        // Smaller than threshold
        assertEquals(0, solution.reverse(-1147483647))
    }
}