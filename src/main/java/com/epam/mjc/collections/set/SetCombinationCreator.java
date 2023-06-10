package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new HashSet<>();
        for(String e : firstSet ){
               if(secondSet.contains(e) && !thirdSet.contains(e)){
                    set.add(e);
                }
        }
        for (String e : thirdSet){
            if(!firstSet.contains(e) && !secondSet.contains(e)){
                set.add(e);
            }
        }
        return set;
    }

    public static void main(String[] args) {
        SetCombinationCreator scc = new SetCombinationCreator();
        Set<String> firstSet = new HashSet<>();
        firstSet.add("Java");
        firstSet.add("Collection");
        firstSet.add("framework");
        firstSet.add("interface");
        firstSet.add("class");
        firstSet.add("Queue");
        Set<String> secondSet = new HashSet<>();
        secondSet.add("Queue");
        secondSet.add("iterator");
        secondSet.add("Java");
        secondSet.add("Collection");
        secondSet.add("comparator");
        Set<String> thirdSet = new HashSet<>();
        thirdSet.add("Java");
        thirdSet.add("Set");
        thirdSet.add("Map");
        thirdSet.add("List");

        Set<String> s = scc.createSetCombination(firstSet, secondSet, thirdSet);
        System.out.println(firstSet);
        System.out.println(secondSet);
        System.out.println(thirdSet);
        System.out.println(s);

    }
}
