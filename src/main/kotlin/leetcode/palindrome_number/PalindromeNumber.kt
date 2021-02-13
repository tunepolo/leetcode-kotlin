package leetcode.palindrome_number

// https://leetcode.com/problems/palindrome-number/

class Solution {
    fun isPalindrome(x: Int): Boolean = (x >= 0) &&
        x == x.toString().reversed().toIntOrNull()
}