package com.league.leetcode.pings;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by coraline on 2019/4/25.
 */
public class RecentCounter {
    private Queue<Integer> queue = new LinkedList();


    public RecentCounter() {

    }

    public int ping(int t) {
        queue.add(t);
        while(queue.peek() < t - 3000){
            queue.poll();
        }
        if(queue == null){
            return 0;
        }
        return queue.size();

    }
}
