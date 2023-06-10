package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> integerHashSet = new HashSet<>();
        for(int element : sourceList){
            integerHashSet.add(element);
            if(element % 2 == 0){
                int current = element;
                while (current % 2 == 0) {
                    current = current / 2;
                    integerHashSet.add(current);
                }
            } else {
                integerHashSet.add(element);
                integerHashSet.add(element * 2);
            }
        }
        return integerHashSet;
    }

    public static void main(String[] args) {
        HashSetCreator hsc = new HashSetCreator();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(-1);
        integerList.add(3);
        integerList.add(8);
        integerList.add(-5);
        integerList.add(12);
        HashSet<Integer> hs = hsc.createHashSet(integerList);
        System.out.println("This is HS: " + hs);
    }
}
