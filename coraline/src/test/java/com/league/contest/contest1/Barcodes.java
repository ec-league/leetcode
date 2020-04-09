package com.league.contest.contest1;

import java.util.*;

public class Barcodes {

    public static int[] rearrangeBarcodes(int[] barcodes) {
        if (barcodes.length < 3) {
            return barcodes;
        }
        Math.pow(2,2);
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
        Iterator it = barcodesMap.keySet().iterator();
        List<Node> nodes = new ArrayList<>();
//        while (it.hasNext()) {
//            Node node = new Node();
//            node.setCount(barcodesMap.get(it.next()));
//            node.setCode((Integer) it);
//            nodes.add(node);
//        }
        sort(nodes);
        List<Integer> rearrangedList = new ArrayList<>();
        int lastAddCode = Integer.MAX_VALUE;
        while (nodes.size() > 0) {
            if (!nodes.get(0).getCode().equals(lastAddCode)) {
                rearrangedList.add(nodes.get(0).getCode());
                int count = nodes.get(0).getCount() - 1;
                if (count == 0) {
                    nodes.remove(0);
                }
                rearrangedList.add(nodes.get(1).getCode());
                lastAddCode = nodes.get(1).getCode();
                count = nodes.get(1).getCount() - 1;
                nodes.get(1).setCount(count);
                if (count == 0) {
                    nodes.remove(0);
                }
                sort(nodes);
            } else {
                rearrangedList.add(nodes.get(1).getCode());
                int count = nodes.get(1).getCount() - 1;
                nodes.get(1).setCount(count);
                if (count == 0) {
                    nodes.remove(0);
                }
                rearrangedList.add(nodes.get(0).getCode());
                lastAddCode = nodes.get(0).getCode();
                count = nodes.get(0).getCount() - 1;
                nodes.get(0).setCount(count);
                if (count == 0) {
                    nodes.remove(0);
                }
                sort(nodes);
            }

        }


        int[] rearrangeArr = new int[barcodes.length];


        return rearrangeArr;
    }

    private static void sort(List<Node> nodes) {
        Collections.sort(nodes, (o1, o2) -> {
            if (o1 == null || o2 == null) {
                return -1;
            }
            if (o1.getCount() > o2.getCount()) {
                return 1;
            }
            if (o1.getCount() < o2.getCount()) {
                return -1;
            }
            if (o1.getCount() == o2.getCount()) {
                return 0;
            }
            return 0;
        });
    }

    public static void main(String[] args) {
        int[] barcodes = {7, 7, 7, 8, 5, 7, 5, 5, 5, 8};
        int[] rearrangeArr = rearrangeBarcodes(barcodes);
        for (int i = 0; i < rearrangeArr.length; i++) {
            System.out.println(rearrangeArr[i]);

        }

    }

    static class Node {

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

    }
}
