package com.silver;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class RamdaClass {
    public static void main(String[] hoges) {
        Function<String, String> func = s -> "hoge";
        BiFunction<String, Integer, String> func2 = (s, integer) -> s + integer;
        BiConsumer<Integer, Integer> func3 = (integer, integer2) -> System.out.println(integer + integer2);
        UnaryOperator<String> func4 = s -> s;

        Stream<Double> stream1 = Stream.generate(Math::random);
        stream1.limit(3).forEach(System.out::println);

        //iterateは無限ストリームを返す limitで制御
        Stream<Integer> stream2 = Stream.iterate(2, x -> x * 2);
        stream2.limit(8).forEach(System.out::println);
    }
}
