package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        boolean state=false;
        Set<String> set=new HashSet<>();
        for (String third : thirdSet) {
            state=false;
            for (String first: firstSet){
                if(third.equals(first)){
                    state=true;
                    break;
                }
            }
            if (!state) {
                for (String second : secondSet) {
                    if (third.equals(second)) {
                        state = true;
                        break;
                    }
                }
            }
            if(!state){
                set.add(third);
            }
        }
        state=false;
        for (String first: firstSet){
            for (String second: secondSet){
                if(first.equals(second)){
                    for (String third: thirdSet){
                        if (first.equals(third)){
                            state=true;
                            break;
                        }
                    }
                    if (!state){
                        set.add(first);
                        break;
                    }
                }
            }
        }
        return set;
    }
}
