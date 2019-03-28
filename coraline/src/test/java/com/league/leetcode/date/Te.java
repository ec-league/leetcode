package com.league.leetcode.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by coraline on 2019/3/25.
 */
public class Te {
    public static void main(String[] args) throws ParseException {
        String dateStr = "2027-02-15";
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
        Date date = f.parse(dateStr);
        System.out.println(date.toString());
    }
}
