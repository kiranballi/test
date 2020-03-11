package main;

import static org.junit.Assert.*;
import org.junit.Test;

public class NumberToWordTest {

  @Test
  public void convertsZero() {
    expectConversion(0, "Zero");
  }

  @Test
  public void convertsSingleDigits() {
    expectConversion(1, "One");
    expectConversion(2, "Two");
    expectConversion(3, "Three");
    expectConversion(4, "Four");
    expectConversion(5, "Five");
    expectConversion(6, "Six");
    expectConversion(7, "Seven");
    expectConversion(8, "Eight");
    expectConversion(9, "Nine");
  }

  @Test
  public void convertsTenToNineteen() {
    expectConversion(10, "Ten");
    expectConversion(11, "Eleven");
    expectConversion(12, "Twelve");
    expectConversion(13, "Thirteen");
    expectConversion(14, "Fourteen");
    expectConversion(15, "Fifteen");
    expectConversion(16, "Sixteen");
    expectConversion(17, "Seventeen");
    expectConversion(18, "Eighteen");
    expectConversion(19, "Nineteen");
  }

  @Test
  public void convertsMultiplesOfTenUpToNinety() {
    expectConversion(20, "Twenty");
    expectConversion(30, "Thirty");
    expectConversion(40, "Forty");
    expectConversion(50, "Fifty");
    expectConversion(60, "Sixty");
    expectConversion(70, "Seventy");
    expectConversion(80, "Eighty");
    expectConversion(90, "Ninety");
  }

  @Test
  public void convertsArbitraryTwoDigitNumbers() {
    expectConversion(42, "Forty Two");
    expectConversion(69, "Sixty Nine");
  }

  @Test
  public void convertsArbitraryHundreds() {
    expectConversion(100, "One Hundred");
    expectConversion(300, "Three Hundred");
  }

  @Test
  public void convertsArbitraryThreeDigitNumbers() {
    expectConversion(123, "One Hundred and Twenty Three");
    expectConversion(360, "Three Hundred and Sixty");
    expectConversion(501, "Five Hundred and One");
  }

  @Test
  public void convertsArbitraryThousands() {
    expectConversion(5000, "Five Thousand ");
    expectConversion(7000, "Seven Thousand ");
  }

  @Test
  public void convertsArbitraryFourDigitNumbers() {
    expectConversion(1234, "One Thousand  Two Hundred and Thirty Four");
    expectConversion(7008, "Seven Thousand  Eight");
  }

  @Test
  public void convertsArbitraryFiveAndSixDigitNumbers() {
    expectConversion(200003, "Two Hundred Thousand  Three");
    expectConversion(10020, "Ten Thousand  Twenty");    
  }

  @Test
  public void convertsArbitrarySevenEightAndNineDigitNumbers() {
    expectConversion(123456789,
        "One Hundred and Twenty Three Million  Four Hundred and Fifty Six Thousand  Seven Hundred and Eighty Nine");    
    expectConversion(12300400, "Twelve Million  Three Hundred Thousand  Four Hundred");
    expectConversion(5000000, "Five Million ");
  }

  @Test(expected = IllegalArgumentException.class)
  public void rejectsNumbersOver999999999() {
    NumberToWord.convert(1000000000);
  }

  private void expectConversion(final int number, final String expectedWords) {
    assertEquals(expectedWords, NumberToWord.convert(number));
  }
}