package com.epam.mjc;

public class StudentAppException extends IllegalArgumentException {
  public StudentAppException(Object fieldValue) {
    super(String.format("Could not find student with ID %s", fieldValue));
  }
}
