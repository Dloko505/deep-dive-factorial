package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;
import static edu.cnm.deepdive.Palindrome.isPalindrome;

import org.junit.jupiter.api.Test;

class PalindromeTest {

  private static final String[] PALINDROMES = {
      "Madam, I'm Adam!",
      "A man, A plan, A canal - Panama!",
      "A Toyota's a Toyota!",
      "Radar"
  };

  private static final String[] NON_PALINDROMES = {
      "A man, A plan, A canal - Panamo!",
      "ab",
      "Abbac",
      "Sonar"
  };

  @Test
  void testTruePalindromes() {
    for (String test : PALINDROMES) {
      assertTrue(isPalindrome(test));
    }
  }

  @Test
  void testFalsePalindromes() {
    for (String test : NON_PALINDROMES) {
      assertFalse(isPalindrome(test));
    }
  }
}