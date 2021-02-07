package leetcode.reverser_integer

// https://leetcode.com/problems/reverse-integer/

class Solution {
    fun reverse(x: Int): Int = if (x > 0) {
        reverseInteger(x)
    } else {
        reverseInteger(kotlin.math.abs(x)) * -1
    }

    private fun reverseInteger(x: Int): Int = x.toString().reversed().toIntOrNull() ?: 0
}