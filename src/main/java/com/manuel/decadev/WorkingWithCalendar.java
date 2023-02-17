package com.manuel.decadev;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class WorkingWithCalendar {


    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        GregorianCalendar calendar2 = new GregorianCalendar();

        System.out.println("Today's Date is: "+" "+ new Date());
        System.out.println("The Year is : " + calendar.get(Calendar.YEAR));
        System.out.println("Month : " + calendar.get(Calendar.MONTH));
        System.out.println("Day of Week" + ":" + calendar.get((Calendar.DAY_OF_WEEK)));
        System.out.println("Day of Month" + ":" + calendar.get(Calendar.DAY_OF_MONTH));
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println("Day of Month" + ":" + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(Calendar.getInstance());
        System.out.println();

    }


}
