package org.example;

import static org.example.Attempt.attempt;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;

class AttemptTest {

  @Test
  void testAttempt() {
    Supplier<?> raise =
        () -> {
          throw new RuntimeException();
        };

    assertEquals(Optional.empty(), attempt(null));
    assertEquals(Optional.empty(), attempt(() -> null));
    assertEquals(Optional.of(1), attempt(() -> 1));
    assertEquals(Optional.empty(), attempt(raise));
  }
}
