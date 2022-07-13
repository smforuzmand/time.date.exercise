package lexicon.se;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeDateEx {

    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        //ex8();
        //ex9();
        //ex10();
        //ex11();
        //ex12();
        //ex13();
        //ex14();
        //ex15();
        ex16();


    }

    //Create a LocalDate of the current day and print it out
    public static void ex1() {
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
    }

    //Exercise2:
    //Create a LocalDate of the current day and print it out in the following pattern using
    //DateTimeFormatter: Torsdag 29 mars.
    public static void ex2() {
        String customFormat = LocalDate.now().format(DateTimeFormatter.ofPattern("eeee dd MMM YYYY"));
        System.out.println("customFormat = " + customFormat);
    }

    //Exercise3:
    //Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO
    //format.
    public static void ex3() {

        LocalDate pDate = LocalDate.parse("2022-06-20");
        System.out.println(pDate.getDayOfMonth());
        System.out.println(LocalDate.now().getDayOfMonth());
        for (int i = 0; i <= LocalDate.now().getDayOfMonth() - pDate.getDayOfMonth(); i++) {
            System.out.println(pDate.plusDays(i));
        }
    }

    //Exercise 4:
    //Create a LocalDate object from a String by using the .parse() method.
    public static void ex4() {
        LocalDate dateObject = LocalDate.parse("2022-06-30");
        System.out.println("dateObject = " + dateObject);
    }

    //Exercise5
    // Create a LocalDate of 1945-05-08 and extract the day of week for that date.
    public static void ex5() {
        LocalDate dateObject = LocalDate.of(1945, 05, 8);
        System.out.println(dateObject.getDayOfWeek());
    }

    //Exercise6
    //Create a LocalDate of current date plus 10 years and minus 10 months. From that date extract the
    //month and print it out
    public static void ex6() {
        LocalDate currentDate = LocalDate.now().plusYears(10).minusMonths(10);
        System.out.println(currentDate.getMonth());
    }

    //Exercise7
    //Using the LocalDate from exercise 6 and your birthdate, create a Period between your birthdate and
    //the date from exercise 5. Print out the elapsed years, months and days.
    public static void ex7() {
        LocalDate myBirthDate = LocalDate.parse("1986-04-11");
        LocalDate dateObject = LocalDate.of(1945, 05, 8);
        Period period = Period.between(dateObject, myBirthDate);
        System.out.println("it is " + period.getYears() + "years and" + period.getMonths() + " " + "months and " + period.getDays() + " days");
    }

    //Exercise 8
    //Create a period of 4 years, 7 months and 29 days. Then create a LocalDate of current date and add
    //the period you created to the current date.
    public static void ex8() {
        Period period = Period.of(4, 7, 29);
        LocalDate current = LocalDate.now().plus(period);
        System.out.println("concatenated date= " + current);
    }

    //Exercise 9
    //Create a LocalTime object of the current time.
    public static void ex9() {
        LocalTime localTime = LocalTime.now();
        System.out.println("timeSample = " + localTime);
    }

    //Exercise 10
    //Extract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds.
    public static void ex10() {
        LocalTime nanoSeconds = LocalTime.now();
        int nanoSecond = nanoSeconds.getNano();
        System.out.println("nanoSecond = " + nanoSecond);
    }

    //Exercise 11
    //Create a LocalTime object from a String using the .parse() method.
    public static void ex11() {
        LocalTime timeSample = LocalTime.parse("19:55:23");
        System.out.println("timeSample = " + timeSample);
    }

    //Exercise 12
    //Using DateTimeFormatter format LocalTime from current time and print it out as following pattern:
    //10:32:53
    public static void ex12() {
        LocalTime localTime = LocalTime.now();
        String localTimeFormatter = localTime.format(DateTimeFormatter.ofPattern("19:55:33"));
        System.out.println("localTimeFormatter = " + localTimeFormatter);
    }

    //Exercise 13
    //Create a LocalDateTime with the date and time components as: date: 2018-04-05, time: 10.00.
    public static void ex13() {
        //LocalDateTime localDateTime=LocalDateTime.of(2022,06,30,20,25);
        LocalDateTime localDateTime = LocalDateTime.of(2022, 06, 30, 22, 8);
        System.out.println("localDateTime = " + localDateTime);
    }

    //Exercise 14
    //Using DateTimeFormatter format the LocalDateTime object from exercise 11 to a String that should
    //look tile this: torsdag 5 april 10:00
    public static void ex14() {
        LocalDateTime localDateTime = LocalDateTime.parse("2022-04-05T10:00");
        String customFormat = localDateTime.format(DateTimeFormatter.ofPattern("eeee dd MMMM hh : mm"));
        System.out.println("customFormat = " + customFormat);
    }

    //Exercise 15
    //Create a LocalDateTime object by combining LocalDate object and LocalTime object.
    public static void ex15() {
        LocalDate localDate = LocalDate.parse("2022-06-30");
        LocalTime localTime = LocalTime.parse("23:00");
        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("dateTime = " + dateTime);

    }

    //Exercise 16
    //Create a LocalDateTime object. Then get the LocalDate and LocalTime components into separate
    //objects of respective types from the LocalDateTime object.
    public static void ex16() {
        LocalDateTime localDateTime = LocalDateTime.of(2022,06,30,23,00);
        LocalDate localDate=localDateTime.toLocalDate();
        LocalTime localTime=localDateTime.toLocalTime();

        System.out.println("localDate = " + localDate+" "+"&"+" "+"localTime = " + localTime);
    }


}


