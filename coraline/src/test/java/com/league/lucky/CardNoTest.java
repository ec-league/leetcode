package com.league.lucky;

import org.junit.Test;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/**
 * Created by coraline on 2019/5/22.
 */
public class CardNoTest {

    public static void main(String[] args) {


        long start = 6259956000000000L;

        long end = 6259956999999999L + 1;
        long l1 = System.currentTimeMillis();

        System.out.println(end - start);
        long step = (end - start) / 1L;

        System.out.println(step);

        List<Range> ranges = new ArrayList<>();
        for (long i = 0; i < 100000; i++) {
            Range range = new Range();
            range.setStart(start);
            long endTemp = start + step;
            range.setEnd(endTemp > end ? end : endTemp);
            ranges.add(range);
            start = endTemp;
        }

        ExecutorService executorService = ExecutorUtils.createExecutorService(30);
        List<Long> list = new CopyOnWriteArrayList<>();
        try {
            for (Range range : ranges) {

                executorService.execute(() -> {
                    long l3 = System.currentTimeMillis();

                    for (Long i = range.getStart(); i < range.getEnd(); i++) {
                        if (matchLuhn(String.valueOf(i))) {
                            list.add(i);
                            System.out.println(Thread.currentThread().getName() + ":" + i);
                        }
                    }
                    long l4 = System.currentTimeMillis();
                    System.out.println("step2:" + (l4 - l3));
                });

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            ExecutorUtils.shutdown(executorService);
        }
        long l7 = System.currentTimeMillis();

        System.out.println("total:" + (l7 - l1));

        System.out.println(list.size());
    }

    /**
     * 匹配Luhn算法：检测银行卡卡号
     *
     * @param cardNo 卡号
     */
    private static boolean matchLuhn(String cardNo) {
        Long tt;

        int[] cardNoArray = new int[cardNo.length()];
        for (int i = 0; i < cardNo.length(); i++) {
            cardNoArray[i] = Integer.parseInt(String.valueOf(cardNo.charAt(i)));
        }


        for (int i = cardNoArray.length - 2; i >= 0; i -= 2) {
            cardNoArray[i] <<= 1;
            cardNoArray[i] = cardNoArray[i] / 10 + cardNoArray[i] % 10;
        }

        int sum = 0;
        for (int aCardNoArray : cardNoArray) {
            sum += aCardNoArray;
        }
        return sum % 10 == 0;
    }


    static class Range {

        private long start;

        private long end;

        public long getStart() {
            return start;
        }

        public void setStart(long start) {
            this.start = start;
        }

        public long getEnd() {
            return end;
        }

        public void setEnd(long end) {
            this.end = end;
        }
    }


    @Test
    public void test(){
        List<GarbageCollectorMXBean> l = ManagementFactory.getGarbageCollectorMXBeans();
        for(GarbageCollectorMXBean b : l) {
            System.out.println(b.getName());
        }

    }

}
