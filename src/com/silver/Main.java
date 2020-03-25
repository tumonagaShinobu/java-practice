package com.silver;

public class Main {

    public static void main(String[] args) {
        OreOreInterface<String> ore = System.out::println;
        ore.foo("hoge");
    }
}
