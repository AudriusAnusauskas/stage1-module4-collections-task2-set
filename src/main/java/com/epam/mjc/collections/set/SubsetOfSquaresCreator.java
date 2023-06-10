package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> subsetSquare = new TreeSet<>();
        for(int element : sourceList){
            int x = element * element;
            if(x >= lowerBound && x <= upperBound){
                subsetSquare.add(x);
            }
        }
        return subsetSquare;
    }

    public static void main(String[] args) {
        SubsetOfSquaresCreator ssc = new SubsetOfSquaresCreator();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(-1);
        integerList.add(5);
        integerList.add(-7);
        integerList.add(4);
        integerList.add(6);
        integerList.add(-9);
        integerList.add(8);

        Set<Integer> si = ssc.createSubsetOfSquares(integerList, 25, 49);
        System.out.println(si);
    }
}
