package com.league.contest.contest1;

import java.util.*;

public class Barcodes {

    static int x = 0, y = 0;
    static int a = 0, b = 0;

    public static int[] rearrangeBarcodes(int[] barcodes) {
        if (barcodes.length < 3) {
            return barcodes;
        }
        //优先级队列
        Map<Integer, Integer> barcodesMap = new HashMap();


        for (int i = 0; i < barcodes.length; i++) {
            if (barcodesMap.get(barcodes[i]) == null) {
                barcodesMap.put(barcodes[i], 1);
            } else {
                Integer codeCount = barcodesMap.get(barcodes[i]);
                codeCount++;
                barcodesMap.put(barcodes[i], codeCount);
            }
        }

        Queue<Node> priorityQueue = new PriorityQueue();

        Set<Integer> keySet = barcodesMap.keySet();
        for (Integer key : keySet) {
            Node node = new Node();
            node.setCode(key);
            node.setCount(barcodesMap.get(key));
            priorityQueue.add(node);
        }

        List<Integer> rearrangedList = new ArrayList<>();
        while (priorityQueue.size() != 0) {
            //个数最大
            Node oldNode1 = priorityQueue.poll();
            rearrangedList.add(oldNode1.getCode());
            //个数次大
            Node oldNode2 = priorityQueue.poll();
            if (oldNode2 == null) {
                continue;
            }
            rearrangedList.add(oldNode2.getCode());
            int tempCount = oldNode1.getCount() - 1;
            if (tempCount != 0) {
                Node newNode = new Node(oldNode1.getCode(), tempCount);
                priorityQueue.add(newNode);
            }
            tempCount = oldNode2.getCount() - 1;
            if (tempCount != 0) {
                Node newNode = new Node(oldNode2.getCode(), tempCount);
                priorityQueue.add(newNode);
            }
        }

        int[] rearrangeArr = new int[barcodes.length];
        for (int i = 0; i < barcodes.length; i++) {
            rearrangeArr[i] = rearrangedList.get(i);
        }


        return rearrangeArr;
    }

    public static void main(String[] args) {
        int[] barcodes = {1, 1, 2};
        int[] rearrangeArr = rearrangeBarcodes(barcodes);
        for (int i = 0; i < rearrangeArr.length; i++) {
            System.out.println(rearrangeArr[i]);

        }

    }

    static class Node implements Comparable<Node> {

        public Node() {
        }

        public Node(Integer code, Integer count) {
            this.code = code;
            this.count = count;
        }

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        private Integer code;
        private Integer count;

        @Override
        public int compareTo(Node o) {
            return count > o.count ? -1 : (count == o.count ? 0 : 1);
        }
    }
}
