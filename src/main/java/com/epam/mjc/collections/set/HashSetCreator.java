package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer> resultSet = new HashSet<>();
        for (int x : sourceList) {
            if (x % 2 == 0) {
                while (x % 2 == 0) {
                    resultSet.add(x);
                    x /= 2;
                }
                resultSet.add(x);
            } else {
                resultSet.add(x);
                resultSet.add(x * 2);
            }
        }
        return resultSet;
    }
}
