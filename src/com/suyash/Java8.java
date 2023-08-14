package com.suyash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8 {
    public static void main(String[] args) {
        List<Emp> empList=new ArrayList<>();
        Emp emp1=new Emp("suyash","yadav",25);
        Emp emp2=new Emp("prasad","yadav",26);
        Emp emp3=new Emp("Shubham","pawar",23);
        Emp emp4=new Emp("shubham","yammi",22);
        Emp emp5=new Emp("swapnil","potdar",22);
        empList.add(emp1); empList.add(emp2);empList.add(emp3); empList.add(emp4); empList.add(emp5);


        /*
        logic without using strem Api
         */
        Map<String,Long> countSirName=new HashMap<>();

        for(Emp emp:empList){
            if(countSirName.containsKey(emp.getLastName())){
                countSirName.put(emp.getLastName(),countSirName.get(emp.getLastName())+1);
            }else {
                countSirName.put(emp.getLastName(),1L);
            }
        }
        System.out.println(countSirName);

         /*
        logic by  using strem Api
         */
        System.out.println("\n");
        Map<String,Long> countMap=empList.stream().collect(Collectors.groupingBy(Emp::getLastName,Collectors.counting()));
        System.out.println(countMap);
    }
}
