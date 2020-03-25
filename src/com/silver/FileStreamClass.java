package com.silver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FileStreamClass {
    public static void main(String[] args) {
        File f1 = new File("src/resources");
        File f2 = new File("resources", "hogeText.txt");
        File f3 = new File(f1, "kongyo.txt");
        Arrays.stream(Objects.requireNonNull(f1.listFiles()))
                .forEach(it -> System.out.println(it.getName() + ": 絶対パス:" + it.getAbsolutePath()));
        //テキストファイル読み込みやり方1
        try (BufferedReader fileInputStream = new BufferedReader(new FileReader(f3))) {
            String data = null;
            while ((data = fileInputStream.readLine()) != null) {
                System.out.println(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //テキストファイル読み込みやり方2
        Path path = Paths.get("src/resources/kongyo.txt");
        try {
            String text = Files.readString(path);
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //テキストファイル読み込みやり方3
        try {
            Path path2 = Paths.get("src/resources/kongyo.txt");
            List<String> textList = Files.readAllLines(path2);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
