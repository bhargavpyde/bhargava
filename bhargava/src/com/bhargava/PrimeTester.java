package com.bhargava;

public class PrimeTester {

  private Solution solution;

  public void runTests() {
    this.solution = new Solution();
    numeralDivisibleByThreeReturnsPrimeTest();
    numeralEqualsThreeReturnsPrimeTest();
    negativeNumberDivisibleByThreeReturnsPrimeTest();
    negativeNumberDivisibleByFiveReturnsTherapeuticsTest();
    numberDivisibleByFiveReturnsTherapeuticsTest();
    numeralEqualsFiveReturnsTherapeuticsTest();
    numeralDivisibleBy15ReturnsPrimeTherapeuticsTest();
    numeralEqualsTo15ReturnsPrimeTherapeuticsTest();
    numeralEqualsToZeroReturnsEmptyStringTest();
    invalidNumberReturnsEmptyStringTest();
  }

  public void numeralDivisibleByThreeReturnsPrimeTest() {
    if (solution.check(6).equals("Prime")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

  public void numeralEqualsThreeReturnsPrimeTest() {
    if (solution.check(3).equals("Prime")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

  public void negativeNumberDivisibleByThreeReturnsPrimeTest() {
    if (solution.check(-6).equals("Prime")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

  public void negativeNumberDivisibleByFiveReturnsTherapeuticsTest() {
    if (solution.check(-25).equals("Therapeutics")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

  public void numberDivisibleByFiveReturnsTherapeuticsTest() {
    if (solution.check(25).equals("Therapeutics")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

  public void numeralEqualsFiveReturnsTherapeuticsTest() {
    if (solution.check(5).equals("Therapeutics")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

  public void numeralDivisibleBy15ReturnsPrimeTherapeuticsTest() {
    if (solution.check(90).equals("Prime Therapeutics")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

  public void numeralEqualsTo15ReturnsPrimeTherapeuticsTest() {
    if (solution.check(15).equals("Prime Therapeutics")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

  public void numeralEqualsToZeroReturnsEmptyStringTest() {
    if (solution.check(0).equals("")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

  public void invalidNumberReturnsEmptyStringTest() {
    if (solution.check(4).equals("")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

}
