package dev.joaov.javacore.Rdata.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1744122956987L);
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
