package com.league.leetcode.date;

import java.text.ParseException;

/**
 * Created by coraline on 2019/3/25.
 */
public class Te {
    public static void main(String[] args) throws ParseException {
//        String dateStr = "2027-02-15";
//        SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
//        Date date = f.parse(dateStr);
//        System.out.println(date.toString());
//
//        Class clazz = dateStr.getClass();
//        clazz.getClasses();
//        System.out.println(clazz != Object.class);


        String x = "23*2342*2323cx*2332*";
        int length1 = x.length();
        x = x.replace("*","");
        int length2 = x.length();
        System.out.println(length1 - length2);
    }
}
