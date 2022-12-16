package com.bhargava;

public class Solution {

  /**
   * Returns Prime if number is divisible by 3, returns Therapeutics if number is divisible by 5
   * Returns Prime Therapeutics if number is divisible by 15
   * and Returns empty string if it is not divisible by 3 or 5
   * @param n Input Number
   * @return String
   */
  public String check(int n) {
    if (n == 0) {
      return "";
    } else if (n%15 == 0) {
      return "Prime Therapeutics";
    } else if (n%3 == 0) {
      return "Prime";
    } else if (n%5 == 0) {
      return "Therapeutics";
    } else {
      return "";
    }
  }
}
