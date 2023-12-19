package com.trp.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListStream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //Iterate List
        iterateList(list);

        //find min value in the list
        findMinInList(list);

		//find max value in the list
		findMaxInList(list);

        //find from 3 to 5 in the list
        findFromInList(list);

        //find by sort asc
        findBySortfromSmall(list);

        //find by sort desc
        findBySortFromBig(list);

    }
    private static void iterateList(List<Integer> list) {
        list.forEach(System.out::println);
    }

    private static void findMinInList(List<Integer> list) {
        int min = list.stream().min(Integer::compare).get();
        System.out.println("Min value in list " + min);
    }

	private static void findMaxInList(List<Integer> list) {
		int min = list.stream().max(Integer::compare).get();
		System.out.println("Max value in list " + min);
	}

    private static void findFromInList(List<Integer> list) {
        List childList = list.stream().filter(i -> i >2).limit(3).collect(Collectors.toList());
        childList.forEach(System.out::println);
    }

    private static void findBySortfromSmall(List<Integer> list) {
        List<Integer> list2 = Arrays.asList(2, 1, 3, 4, 5, 6, 7, 8, 9);
        List childList = list2.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list from small: ");
        childList.forEach(System.out::print);
    }
    private static void findBySortFromBig(List<Integer> list) {
        List<Integer> list2 = Arrays.asList(2, 1, 3, 4, 5, 6, 7, 8, 9);
        List childList = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted list from Big: ");
        childList.forEach(System.out::print);
    }
}
