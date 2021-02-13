package leetcode.palindrome_number

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PalindromeNumberTest {
    private val solution = Solution()

    @Test
    fun leetcodeExampleTest() {
        assertEquals(true, solution.isPalindrome(121))
        assertEquals(false, solution.isPalindrome(-121))
        assertEquals(false, solution.isPalindrome(10))
        assertEquals(false, solution.isPalindrome(-101))
    }

    @Test
    fun leetcodeSubmissionTest() {
        assertEquals(true, solution.isPalindrome(0))
        assertEquals(false, solution.isPalindrome(1234567899))
    }
}