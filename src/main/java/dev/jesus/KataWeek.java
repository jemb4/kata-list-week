package dev.jesus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class KataWeek {

  private List<String> weekDaysList;
  private String[] daysArray = new String[] {
      "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
  };

  public KataWeek() {
    createListDays();
  }

  public void createListDays() {
    weekDaysList = new ArrayList<>();

    for (String string : daysArray) {
      weekDaysList.add(string);
    }
  }

  public List<String> getDays() {
    return weekDaysList;
  }

  public int getWeekSize() {
    return weekDaysList.size();
  }

  public void deleteDay(String day) {
    weekDaysList.remove(day);
  }

  public String getRequestedDay(String day) {
    return "";
  }

  public boolean dayExist(String day) {
    for (String string : weekDaysList) {
      if (string.equalsIgnoreCase(day)) {
        return true;
      }
    }
    return false;
  }

  public void orderList() {
    Collections.sort(weekDaysList);
  }

  public void clearList() {
    weekDaysList.clear();
  }
}
