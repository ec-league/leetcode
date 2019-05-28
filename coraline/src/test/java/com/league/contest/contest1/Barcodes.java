package com.league.contest.contest1;

import java.util.*;

public class Barcodes {

    public static int[] rearrangeBarcodes(int[] barcodes) {
        if (barcodes.length < 3) {
            return barcodes;
        }
        Map barcodesMap = new HashMap<Integer, Integer>();
        Integer maxCode = 0;
        Integer maxCodeCount = 0;
        for (int i = 0; i < barcodes.length; i++) {
            if (barcodesMap.get(barcodes[i]) == null) {
                barcodesMap.put(barcodes[i], 1);
            } else {
                Integer codeCount = (Integer) barcodesMap.get(barcodes[i]);
                codeCount++;
                if (codeCount > maxCodeCount) {
                    maxCode = barcodes[i];
                    maxCodeCount = codeCount;
                }
                barcodesMap.put(barcodes[i], codeCount);
            }

        }
        int[] rearrangeArr = new int[barcodes.length];
        List<Integer> rearrangedList = new ArrayList<>();
        Arrays.sort(barcodes);
        int low = -1;
        int high = Integer.MAX_VALUE;
        for (int i = 0; i < barcodes.length; i++) {
            if (barcodes[i] == maxCode && low == -1 && high == Integer.MAX_VALUE) {
                low = i;
            } else if (barcodes[i] == maxCode) {
                high = i;
            }
        }
        int j = 0;
        int i = low;
        while (i <= high || j < barcodes.length) {
            for (; i <= high; ) {
                rearrangedList.add(barcodes[i]);
                i++;
                break;
            }
            for (; j < barcodes.length; ) {
                if (barcodes[j] == maxCode) {
                    j++;
                    continue;
                }
                rearrangedList.add(barcodes[j]);
                j++;
                break;
            }

        }


        for (int k = 0; k < barcodes.length; k++) {
            rearrangeArr[k] = rearrangedList.get(k);
        }

        return rearrangeArr;
    }

    public static void main(String[] args) {
        int[] barcodes = {7, 7, 7, 8, 5, 7, 5, 5, 5, 8};
        int[] rearrangeArr = rearrangeBarcodes(barcodes);
        for (int i = 0; i < rearrangeArr.length; i++) {
            System.out.println(rearrangeArr[i]);

        }

    }
}
