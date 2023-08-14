package com.suyash;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {
  private static final Logger logger=Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) {
        List<Emp>  empList=new ArrayList<>();
        Emp emp1=new Emp("suyash","yadav",25);
        Emp emp2=new Emp("prasad","yadav",26);
        Emp emp3=new Emp("Shubham","pawar",23);
        Emp emp4=new Emp("shubham","yammi",22);
        Emp emp5=new Emp("swapnil","potdar",22);
        empList.add(emp1); empList.add(emp2);empList.add(emp3); empList.add(emp4); empList.add(emp5);

        empList.stream().forEach(System.out::println);
        System.out.println("\n"+"sort list by ascending order using strem");
        empList.stream().sorted(Comparator.comparing(Emp::getAge)).forEach(System.out::println);
        System.out.println("\n"+"sort list by descending order using strem");
        empList.stream().sorted(Comparator.comparing(Emp::getAge).reversed()).forEach(System.out::println);
        System.out.println("\n"+"Convert name to upper case using strem");
        empList.stream().map(a-> a.getName().toUpperCase(Locale.ROOT)).forEach(System.out::println);
        System.out.println("\n"+"get count from age of emp");
        Map<Integer, Long> collect=empList.stream().collect(Collectors.groupingBy(Emp::getAge, Collectors.counting()));
        System.out.println(collect);
        System.out.println("\n"+"show only odd number ages");
        empList.stream().filter(a -> a.getAge()%2==1).forEach(System.out::println);

    }
}
