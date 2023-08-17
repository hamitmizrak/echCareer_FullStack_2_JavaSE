package com.collections;

import java.util.*;

public class SetData {

    public static void main(String[] args) {
       // List<Integer> listem=new ArrayList<>();
        Set<Integer> listem=new LinkedHashSet<>();
        listem.add(5);
        listem.add(1);
        listem.add(3);
        listem.add(9);
        listem.add(9);
        listem.add(9);
        listem.add(9);
        listem.stream().forEach((temp)-> System.out.print(temp+" "));

    }
}
