package com.change.capture.cdc.study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortBinary {



        public static void main(String[] args){

            Integer[] a = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };

            List<Integer> list = Arrays.asList(a);

            List<Integer> collect = list.stream().sorted().collect(Collectors.toList());

            System.out.println(collect);


        }
}