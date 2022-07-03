package lexicon.se;

import java.time.*;

public class TimeDateEx {

    public static void main(String[] args) {
        ex1();

        /*//Create a LocalDate of the current day and print it out in the following pattern using
        //DateTimeFormatter: Torsdag 29 mars.
        String customFormat = today.format(DateTimeFormatter.ofPattern("eeee dd MMM YYYY"));
        //Create a LocalDate of last Monday.
        //Then print out the entire week in a loop using standard ISOformat.

        LocalDate lastMonday = LocalDate.of(2022, 06, 27);

        DayOfWeek monday = lastMonday.getDayOfWeek();

        LocalDate pDate = LocalDate.parse("2022-06-20");
        System.out.println(pDate.getDayOfMonth());
        System.out.println(LocalDate.now().getDayOfMonth());
        for (int i = 0; i <= LocalDate.now().getDayOfMonth() - pDate.getDayOfMonth(); i++) {
            System.out.println(pDate.plusDays(i));
        }

        System.out.println("today is = " + today);
        System.out.println("customFormat = " + customFormat);
        System.out.println("monday = " + monday);*/


    }


    //Create a LocalDate of the current day and print it out
    public static void ex1() {
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
    }


}