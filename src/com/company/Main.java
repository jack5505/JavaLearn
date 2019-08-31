package com.company;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {

    public static void main(String[] args)
    {

        Product product =
                new Product.
                Builder(15)
                .fat("YOGLI")
                .name("JACK")
                .sodium("SODALI")
                .build();

        Set<String> first = new HashSet<String>();
        Set<String> second = new HashSet<String>();
        first.add("Salom");
        first.add("hello");
        second.add("hello");
        System.out.println(numElementTheSame(first,second));
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        s1.add(15);
        s1.add(78);
        s1.add(789);
        s2.add(789);
        s2.add(78);
        s2.add(15);
        System.out.println(numElementTheSame(s1,s2));

    }
    static int numElementTheSame(Set<?> s1, Set<?> s2){
        int result = 0;
        for(Object o1 : s1){
            if(s2.contains(o1))
                result++;
        }
        return result;
    }
}
