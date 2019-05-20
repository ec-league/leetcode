package com.league.basic;

/**
 * Created by coraline on 2019/5/14.
 */
public class InternTest {

    public static void main(String[] args) {
//        String s1 = new String("1");
//        s1 = s1.intern();
//        String s2 = "1";
//        System.out.println(s1 == s2);


        String str1 = "aaa";
        String str2 = "bbb";
        String str3 = "aaabbb";
        String str4 = str1 + str2;
        String str5 = "aaa" + "bbb";
        System.out.println(str3 == str4); // false
        System.out.println(str3 == str4.intern()); // true
        System.out.println(str3 == str5);// true
    }

    public void test(){
        new SynchronizedTest();
        System.out.println("sdfsdf");
    }


}
