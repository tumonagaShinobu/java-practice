package com.silver;

import java.util.Optional;
import java.util.stream.IntStream;

public class StreamClass {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(10, 20, 30);
        int result = stream.reduce(0, Integer::sum);
        var hoge = Optional.empty();
        if (hoge == null) {
            System.out.println("nullです");
        }
        System.out.println(hoge.isEmpty());
        if (hoge.orElse(null) == null) {
            System.out.println("ほらnullです");
        }
        var foo = Optional.of("foo");
        foo.ifPresent(System.out::println);
    }
}
