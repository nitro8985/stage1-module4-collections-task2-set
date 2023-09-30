package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> resultSet = new TreeSet<>();
        for (int x : sourceList) {
            resultSet.add(x * x);
        }
        return resultSet.subSet(lowerBound, true, upperBound, true);
    }
}
