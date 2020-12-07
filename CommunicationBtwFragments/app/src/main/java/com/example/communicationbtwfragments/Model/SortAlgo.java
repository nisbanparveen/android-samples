package com.example.communicationbtwfragments.Model;

import java.util.Arrays;

public class SortAlgo {

    public static Sort sort(String input){
        Sort sort= new Sort();
        sort.setSortAscending(sortAscending(input));
        sort.setSortDescending(sortDescending(input));
        return sort;
    }

    private static int[] sortAscending(String input){
        int temp;
        String[]  stringArray= input.split(",");
        int[] num = Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < num.length; i++)
        {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        return num;
    }
    private static int[] sortDescending(String input){
        int temp;
        String[]  stringArray= input.split(",");
        int[] num = Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < num.length; i++)
        {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        return num;
    }
}
