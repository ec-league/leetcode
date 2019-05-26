package com.league.contest.contest1;

import java.util.*;

public class Barcodes {

    public static int[] rearrangeBarcodes(int[] barcodes) {
        Map barcodesMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < barcodes.length; i++) {
            if (barcodesMap.get(barcodes[i]) == null) {
                barcodesMap.put(barcodes[i], 1);
            } else {
                Integer codeCount = (Integer) barcodesMap.get(barcodes[i]);
                codeCount++;
                barcodesMap.put(barcodes[i], codeCount);
            }

        }
        int[] rearrangeArr = new int[barcodes.length];


        Iterator it = barcodesMap.keySet().iterator();
        List<Integer> codes = new ArrayList();
        Integer bigestSizeCode = 0;
        Integer maxSize = 0;

        while (it.hasNext()) {
            codes.add((Integer) it.next());
            if ((Integer)barcodesMap.get(it.next()) > maxSize) {
                maxSize = (Integer) barcodesMap.get(it.next());
                bigestSizeCode = (Integer) it.next();
            }
        }
        boolean flag = false;
        for (int i = 0; i < barcodes.length; i++) {
            if (!flag && !barcodesMap.get(bigestSizeCode).equals(new Integer(0))) {
                rearrangeArr[i] = bigestSizeCode;
                flag = true;
                Integer codeCount = (Integer) barcodesMap.get(bigestSizeCode);
                codeCount--;
                barcodesMap.put(bigestSizeCode, codeCount);
                continue;
            }
            flag = false;
            Integer mod = i % (codes.size() -1);
            while(codes.get(mod).equals(bigestSizeCode) || barcodesMap.get(codes.get(mod)).equals(new Integer(0))){
                mod++;
            }
            rearrangeArr[i] = codes.get(mod);
            Integer codeCount = (Integer) barcodesMap.get(codes.get(mod));
            codeCount--;
            barcodesMap.put(codes.get(mod), codeCount);


        }


        return rearrangeArr;
    }

    public static void main(String[] args) {
        int[] barcodes = {1, 1, 1, 1, 2, 2, 3, 3};
        int[] rearrangeArr = rearrangeBarcodes(barcodes);
        for (int i = 0; i < rearrangeArr.length; i++) {
            System.out.println(rearrangeArr[i]);

        }

    }
}
