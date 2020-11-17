package com.league.daily;

import java.util.*;

/**
 * Created by coraline on 2020/11/17.
 */
public class AllCellsDistOrder {

    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        Map treeMap = new TreeMap<Integer, List<int[]>>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int distance = Math.abs(i - r0) + Math.abs(j - c0);
                if (treeMap.get(distance) == null) {
                    List list = new ArrayList<int[]>();
                    list.add(new int[]{i, j});
                    treeMap.put(distance, list);
                } else {
                    List list = (List) treeMap.get(distance);
                    list.add(new int[]{i,j});
                    treeMap.put(distance, list);
                }
            }
        }

        int[][] arr = new int[R * C][];
        Iterator it = treeMap.keySet().iterator();
        int count = 0;
        while (it.hasNext()) {
            List treeList = (List)treeMap.get(it.next());
            for(int k = 0; k < treeList.size(); k++){
                arr[count] = (int[]) treeList.get(k);
                count++;
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int R = 1;
        int C = 2;
        int r0 = 0;
        int c0 = 0;
        int[][] arr = allCellsDistOrder(R, C, r0, c0);

    }
}
