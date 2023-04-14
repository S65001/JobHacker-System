package org.example.task_3.chapter_nine;

public class GregorianCalendar {
    public static void main(String[] args) {

        java.util.GregorianCalendar calender = new java.util.GregorianCalendar();

        System.out.println("Current year: "+calender.get(calender.YEAR));
        System.out.println("Current month: "+calender.get(calender.MONTH));
        System.out.println("Current Day: "+calender.get(calender.DAY_OF_MONTH));


        // after setting elapsed time
        calender.setTimeInMillis(1234567898765L);
        System.out.println("Current year: "+calender.get(calender.YEAR));
        System.out.println("Current month: "+calender.get(calender.MONTH));
        System.out.println("Current Day: "+calender.get(calender.DAY_OF_MONTH));

    }
}
