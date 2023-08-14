package com.suyash;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStudy {
    public static void main(String[] args) {
        String s="newString";
        char[] arr=s.toCharArray();
        System.out.println(Arrays.toString(arr));
        int[] ints=new int[]{1, 2, 3, 4, 5, 6, 2, 3, 4, 10};

        Arrays.stream(ints).forEach(System.out::println);



    }
}

