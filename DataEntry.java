package courseProjectPhase1;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DataEntry {

  // Ensuring that the input string is not empty
  private static void validateNotEmpty(String data) {
    if (data == null || data.trim().isEmpty()) {
      throw new IllegalArgumentException("Input cannot be empty");
    }
  }

  // Entry of string data with an exact length
  public static String enterStringWithExactLength(String data, int exactLength) {
    validateNotEmpty(data);
    if (data.length() != exactLength) {
      throw new IllegalArgumentException("Data must be exactly " + exactLength + " characters long");
    }
    return data;
  }

  // Entry of string data with no limit
  public static String enterString(String data) {
    validateNotEmpty(data);
    return data;
  }

  // Entry of string data but with a length limit
  public static String enterStringWithMaxLength(String data, int maxLength) {
    validateNotEmpty(data);
    if (data.length() > maxLength) {
      return data.substring(0, maxLength);
    }
    return data;
  }

  // Entry of string data that must only have numeric values
  public static String enterNumericString(String data) {
    validateNotEmpty(data);
    if (!data.matches("\\d+")) {
      throw new IllegalArgumentException("Invalid numeric string data");
    }
    return data;
  }

  // Entry of integer data
  public static int enterInteger(int data) {
    return data;
  }

  // Entry of integer data with a range limit
  public static int enterIntegerWithRange(int data, int min, int max) {
    if (data < min || data > max) {
      throw new IllegalArgumentException("Integer data not within the specified range [" + min + ", " + max + "]");
    }
    return data;
  }

  // Entry of decimal data
  public static double enterDecimal(double data) {
    return data;
  }

  // Entry of decimal data with a range limit
  public static double enterDecimalWithRange(double data, double min, double max) {
    if (data < min || data > max) {
      throw new IllegalArgumentException("Decimal data not within the specified range [" + min + ", " + max + "]");
    }
    return data;
  }

  // Entry of a date
  public static String enterDate(String data) {
    validateNotEmpty(data);
    try {
      LocalDate.parse(data);
    } catch (DateTimeParseException e) {
      throw new IllegalArgumentException("Invalid date format. Please use 'YYYY-MM-DD'");
    }
    return data;
  }
}