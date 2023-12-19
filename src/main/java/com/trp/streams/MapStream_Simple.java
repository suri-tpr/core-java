package com.trp.streams;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStream_Simple {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "A",2, "B",
                3, "C", 4, "D",5, "E", 6, "F" );

        //Iterate map
        iterateMap(map);

        //Iterate map order by key
        iterateMapOrderByKey(map);

        //Iterate map order by key from reverse
        iterateMapOrderByKey_reverse(map);
        //Iterate map order by key from reverse
        findIfContains(map, 2);


    }


    private static void iterateMap(Map<Integer, String> map){

        // with for forLoop
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println("with for loop");
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // with streams
        map.entrySet().stream().forEach((i) -> {
            System.out.println("with streams");
            System.out.println(i.getKey());
            System.out.println(i.getValue());
        });

    }
    private static void iterateMapOrderByKey(Map<Integer, String> map){
      Map<Integer, String> linkedMap =  map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (oldValue, newValue) -> oldValue, LinkedHashMap::new));;


            System.out.println("Order by key");
            linkedMap.forEach((i,j) -> {
            System.out.println(i);
            System.out.println(j);
        });

    }

    private static void iterateMapOrderByKey_reverse(Map<Integer, String> map){
        Map<Integer, String> linkedMap =  map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (oldValue, newValue) -> oldValue, LinkedHashMap::new));;


        System.out.println("Order by key from reverse");
        linkedMap.forEach((i,j) -> {
            System.out.println(i);
            System.out.println(j);
        });

    }
    private static void findIfContains(Map<Integer, String> map, int key){

       Map<Integer, String> childMap =  map.entrySet().stream().filter(i -> i.getKey().equals(key)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Child Map if contains");
        childMap.forEach((i,j) -> {
            System.out.println(i);
            System.out.println(j);
        });

    }
}
