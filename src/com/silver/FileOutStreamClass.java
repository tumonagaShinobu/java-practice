package com.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOutStreamClass {
    public static void main(String[] hoge) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine());
    }
}
