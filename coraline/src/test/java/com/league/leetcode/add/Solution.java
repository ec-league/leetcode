package com.league.leetcode.add;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coraline on 2019/3/4.
 */
public class Solution {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode cur = l1;
        List<Integer> list1 = new ArrayList<>();
        while (cur != null) {
            list1.add(cur.val);
            cur = cur.next;
        }

        cur = l2;
        List<Integer> list2 = new ArrayList<>();
        while (cur != null) {
            list2.add(cur.val);
            cur = cur.next;
        }

        int resultLen = list1.size() > list2.size() ? list1.size() : list2.size();

        List<Integer> result = new ArrayList<>(1);
        int carry = 0;

        for (int i = 0; i <= resultLen; i++) {
            int sum = 0;
            if ((list1.size() - 1 < i) && (list2.size() - 1 < i) && carry == 0) {
                break;
            } else if ((list1.size() - 1 < i) && (list2.size() - 1 < i) && carry == 1) {
                sum = 1;
            } else if (list1.size() - 1 < i) {
                sum = list2.get(i) + carry;
            } else if (list2.size() - 1 < i) {
                sum = list1.get(i) + carry;
            } else {
                sum = list1.get(i) + list2.get(i) + carry;
            }

            if (sum > 9) {
                result.add(sum - 10);
                carry = 1;
            } else {
                result.add(sum);
                carry = 0;
            }
        }

        System.out.println(result);
        ListNode head = recurse(result, 0);
        return head;

    }

    public static ListNode recurse(List<Integer> result, int i) {
        ListNode node = new ListNode(result.get(i));
        if (i == result.size() - 1) {
            node.next = null;
        } else {
            node.next = recurse(result, ++i);
        }
        System.out.println(node.val);
        return node;
    }


    public static void main(String[] args) {
        ListNode l12 = new ListNode(3);
        ListNode l11 = new ListNode(4);
        ListNode l1 = new ListNode(Integer.MAX_VALUE);
        l1.next = l11;
        l11.next = l12;

        ListNode l22 = new ListNode(4);
        ListNode l21 = new ListNode(6);
        ListNode l2 = new ListNode(Integer.MAX_VALUE);
        l2.next = l21;
        l21.next = l22;

//        ListNode l1 = new ListNode(0);
//        l1.next = null;
//        ListNode l2 = new ListNode(0);
//        l2.next = null;
        addTwoNumbers(l1, l2);
    }


    @Test
    public void test() {
        List<Integer> l1 = new ArrayList<Integer>(3);
        l1.add(2);
        l1.add(4);
        l1.add(3);

        List<Integer> l2 =  new ArrayList<Integer>(3);
        l2.add(5);
        l2.add(6);
        l2.add(4);


        ListNode list1 = recurse(l1, 0);
        ListNode list2 = recurse(l2, 0);
        addTwoNumbers(list1, list2);
    }
}
