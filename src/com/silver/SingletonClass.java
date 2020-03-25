package com.silver;

public class SingletonClass {
    private static final SingletonClass instance = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return instance;
    }
}
