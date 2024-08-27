package org.example;

import java.util.List;

import static org.example.SubstringFinder.findSubstrings;

public class Main {
    public static void main(String[] args) {
        String S = "abcdefghijklmnopqrstuvwxyz";
        List<String> Q = List.of("abc", "def", "ano", "xyz", "xxx");
        List<Boolean> results = findSubstrings(S,Q);
        System.out.println(results);
    }
}