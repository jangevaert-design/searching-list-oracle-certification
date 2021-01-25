package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchingList {

  public static void main(String[] args) {
    List<String> numsList = new ArrayList<>();
    numsList.add("500");
    numsList.add("10");
    numsList.add("9");
    numsList.add("50");
    numsList.add("40");

    System.out.println(numsList);

    int index = Collections.binarySearch(numsList, "10");
    System.out.println(index);//prints -1 because of the ArrayList is not sorted.

    Collections.sort(numsList);
    index = Collections.binarySearch(numsList, "10");
    System.out.println(index);//prints 0 because "10" will be on index 0 after sorting.

    List<Integer> numbers = Arrays.asList(5, 4, 8, 10, 11, 7, 3);
    System.out.println(numbers);
    index = Collections.binarySearch(numbers, 7);
    System.out.println(index);//prints -3 because not sorted.

    Collections.sort(numbers);
    index = Collections.binarySearch(numbers, 7);
    System.out.println(numbers);//prints 3.
    System.out.println(index);
  }
}
