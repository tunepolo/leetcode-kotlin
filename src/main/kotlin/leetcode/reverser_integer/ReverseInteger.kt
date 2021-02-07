package leetcode.reverser_integer

// https://leetcode.com/problems/reverse-integer/

class Solution {
    fun reverse(x: Int): Int = if (x > 0) {
        reverseInteger(x)
    } else {
        -reverseInteger(-x)
    }

    private fun reverseInteger(x: Int): Int = x.toString().reversed().toIntOrNull() ?: 0
}