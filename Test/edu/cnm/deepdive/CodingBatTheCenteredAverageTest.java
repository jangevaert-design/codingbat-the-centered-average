package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatTheCenteredAverageTest {

  private int[][] averageParams = {
      {1, 2, 3, 4, 100},
      {1, 1, 5, 5, 10, 8, 7},
      {-10, -4, -2, -4, -2, 0},
      {5, 3, 4, 6, 2},
      {5, 3, 4, 0, 100},
      {100, 0, 5, 3, 4},
      {4, 0, 100},
      {0, 2, 3, 4, 100},
      {1, 1, 100},
      {7, 7, 7},
      {1, 7, 8},
      {1, 1, 99, 99},
      {1000, 0, 1, 99},
      {4, 4, 4, 4, 5},
      {4, 4, 4, 1, 5},
      {6, 4, 8, 12, 3}
  };

  private int[] averageExpected = {3, 5, -3, 4, 4, 4, 4, 3, 1, 7, 7, 50, 50, 4, 4, 6};

  @Test
  void averageTest() {
    for (int i = 0; i < averageExpected.length; i++) {
      int actual = CodingBatTheCenteredAverage.centeredAverage(averageParams[i]);
      Assertions.assertEquals(actual, averageExpected[i]);

    }
  }
}