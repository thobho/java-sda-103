package sda.javabasics.weekend3;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTime {

  //https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html
  public static void main(String[] args) throws InterruptedException {

    LocalDate localDate = LocalDate.now();
    LocalDate localDate2 = LocalDate.of(2030, 1, 1);

    Period between = Period.between(localDate, localDate2);

    long years = between.getYears();
    long months = between.getMonths();
    long days = between.getDays();

    System.out.println(years);
    System.out.println(months);
    System.out.println(days);
  }

  private static void example() {
    Instant start = Instant.now();

    LocalDate localDate = LocalDate.now();
    LocalTime localTime = LocalTime.now();
    LocalDateTime localDateTime = LocalDateTime.now();
    LocalDate dayOfBithDay = LocalDate.of(1990, 1, 1);

    System.out.println(start);
    System.out.println(localDate);
    System.out.println(localDateTime);

    Period period = Period.ofDays(1);
    Duration duration = Duration.ofHours(10);

    ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Poland"));
  }


}
