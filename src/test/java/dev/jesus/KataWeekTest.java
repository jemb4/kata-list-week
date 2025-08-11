package dev.jesus;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class KataWeekTest {

  private KataWeek kataWeek;

  @BeforeEach
  void setUp() {
    kataWeek = new KataWeek();
  }

  @Test
  void testCreateListDays() {

  }

  @Test
  void testDayExist() {
    Boolean result = kataWeek.dayExist("Monday");

    assertTrue(result);
  }

  @Test
  void testDeleteDay() {

  }

  @Test
  void testGetDay() {

  }

  @Test
  void testGetDays() {

  }

  @Test
  void testGetWeekSize() {

  }

  @Test
  void testOrderList() {

  }

  @Test
  void testClearList() {
    kataWeek.clearList();

    int kataWeekSize = kataWeek.getWeekSize();

    assertEquals(0, kataWeekSize);
    assertTrue(kataWeek.getDays().isEmpty());
  }
}
