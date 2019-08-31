package com.company;

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
        System.out.println("HELLO");

    }
}
