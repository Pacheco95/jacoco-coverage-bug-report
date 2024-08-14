package org.example;

import java.util.Optional;
import java.util.function.Supplier;

public class Attempt {
  public static <T> Optional<T> attempt(Supplier<T> fn) {
    try {
      return Optional.ofNullable(fn.get());
    } catch (Exception e) {
      return Optional.empty();
    }
  }
}
