package dev.jesus;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KataWeekTest {

  private KataWeek kataWeek;
  private String[] days4test = new String[] { "Lunes", "Jueves", "Domingo" };

  @BeforeEach
  void setUp() {
    kataWeek = new KataWeek();
    kataWeek.createListDays();
  }

  @Test
  void testCreateListDays() {
    assertEquals(kataWeek, kataWeek);
  }

  @Test
  void testDayExist() {
    Boolean resultTrue = kataWeek.dayExist("Lunes");
    Boolean resultFalse = kataWeek.dayExist("Lun");

    assertTrue(resultTrue);
    assertFalse(resultFalse);
  }

  @Test
  void testDeleteDay() {
    kataWeek.getDays();
    kataWeek.deleteDay("Miércoles");

    System.out.println(kataWeek.getDays());

    assertThat(6, is(equalTo(kataWeek.getWeekSize())));
    assertFalse(kataWeek.dayExist("Miércoles"));
  }

  @Test
  void testGetRequestedDay() {

  }

  @Test
  void testGetDays() {
    List<String> result = kataWeek.getDays();

    assertTrue(result.contains("Lunes"));
    assertTrue(result.contains("Jueves"));
    assertTrue(result.contains("Domingo"));
  }

  @Test
  void testGetWeekSize() {
    int expected = 7;

    int result = kataWeek.getWeekSize();

    assertThat(result, is(equalTo(expected)));
  }

  @Test
  void testOrderList() {
    assertThat(null, false);
  }

  @Test
  void testClearList() {
    kataWeek.clearList();

    int kataWeekSize = kataWeek.getWeekSize();

    assertEquals(0, kataWeekSize);
    assertTrue(kataWeek.getDays().isEmpty());
  }
}
