package com.company;

public class LongestPalindromicSubstring {
    class Solution {
//        Potential to brute-force by checking for every possible substring: O(n^3) time complexity
//        Key to the problem is dynamic programming: O(n^2)

        public String longestPalindrome(String s) {
            String result = "";
            int maxLength = 0;
            for (int i = 0; i < s.length(); i++) {
                // Check for odd-length palindromes
                String palindrome = getLongestPalindrome(s, i, i);
                int length = palindrome.length();
                if (length > maxLength) {
                    result = palindrome;
                    maxLength = length;
                }

                // Check for even-length palindromes
                palindrome = getLongestPalindrome(s, i, i + 1);
                length = palindrome.length();
                if (length > maxLength) {
                    result = palindrome;
                    maxLength = length;
                }
            }
            return result;
        }

        private String getLongestPalindrome(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            return s.substring(left + 1, right);
        }
    }
}
