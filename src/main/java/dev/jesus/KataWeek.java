package dev.jesus;

import java.util.ArrayList;
import java.util.List;

public class KataWeek {

  private List<String> weekDaysList;

  public KataWeek() {
    createListDays();
  }

  public void createListDays() {
    weekDaysList = new ArrayList<>();
    weekDaysList.add("Lunes");
    weekDaysList.add("Martes");
    weekDaysList.add("Miércoles");
    weekDaysList.add("Jueves");
    weekDaysList.add("Viernes");
    weekDaysList.add("Sábado");
    weekDaysList.add("Domingo");
  }

  public List<String> getDays() {
    return weekDaysList;
  }

  public int getWeekSize() {
    return weekDaysList.size();
  }

  public void deleteDay(String day) {

  }

  public String getDay(int numbDay) {
    return "";
  }

  public boolean dayExist(String day) {
    for (String string : weekDaysList) {
      string.contains(day);
    }
    return true;
  }

  public void orderList() {

  }

  public void clearList() {
    weekDaysList.clear();
  }
}
