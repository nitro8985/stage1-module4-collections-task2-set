package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> resultSet = new HashSet<>();

        Set<String> intersectionSet = new HashSet<>(firstSet);
        intersectionSet.retainAll(secondSet);
        intersectionSet.removeAll(thirdSet);

        Set<String> onlyThirdSet = new HashSet<>(thirdSet);
        onlyThirdSet.removeAll(firstSet);
        onlyThirdSet.removeAll(secondSet);

        resultSet.addAll(intersectionSet);
        resultSet.addAll(onlyThirdSet);

        return resultSet;
    }
}
