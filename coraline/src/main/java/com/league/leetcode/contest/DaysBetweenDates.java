package com.league.leetcode.contest;



public class DaysBetweenDates {

    public static int daysBetweenDates(String date1, String date2) {
        if(date1.equals(date2)){
            return 0;
        }

        String[] dateArr1 = date1.split("-");
        String[] dateArr2 = date2.split("-");
        Integer year1 = Integer.valueOf(dateArr1[0]);
        Integer year2 = Integer.valueOf(dateArr2[0]);
        Integer month1 = Integer.valueOf(dateArr1[1]);
        Integer month2 = Integer.valueOf(dateArr2[1]);
        Integer days1 = Integer.valueOf(dateArr1[2]);
        Integer days2 = Integer.valueOf(dateArr2[2]);
        if((year1 < year2) || ((year1 == year2) && month1 < month2) || ((year1 == year2) && (month1 == month2) && days1 < days2)){

        }

        return 0;

    }

    public static void main(String[] args) {

        String date1 = "2020-01-15";
        String date2 = "2019-12-31";
        int days = daysBetweenDates(date1, date2);
        System.out.println(days);

    }
}
