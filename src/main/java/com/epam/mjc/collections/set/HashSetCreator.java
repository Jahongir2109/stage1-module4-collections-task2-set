package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer>hashSet=new HashSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            if (sourceList.get(i)%2==0){
                odd(hashSet,sourceList.get(i));
            }else {
                hashSet.add(sourceList.get(i));
                hashSet.add(sourceList.get(i)*2);
            }
        }
        return hashSet;
    }
    public static void odd(HashSet<Integer>hashSet,int number){
        while (true) {
            if (number % 2 == 0) {
                hashSet.add(number);
                number=number/2;
            }else {
                hashSet.add(number);
                break;
            }
        }
    }
}
