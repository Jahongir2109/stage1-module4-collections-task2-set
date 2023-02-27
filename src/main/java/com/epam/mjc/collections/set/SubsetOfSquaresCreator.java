package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set =new HashSet<Integer>();
        for (int i = 0; i < sourceList.size(); i++) {
            if (sourceList.get(i)!=null){
                int kv=sourceList.get(i)*sourceList.get(i);
                if(kv>=lowerBound && kv<=upperBound){
                    set.add(kv);
                }
            }
        }
        return set;
    }
}
