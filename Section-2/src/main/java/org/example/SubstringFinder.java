package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubstringFinder  {
    public static List<Boolean> findSubstrings(String S, List<String> Q) {
        Set<String>
                subStringset = new HashSet<>();
        int maxLength = 100;

        for (int start = 0; start < S.length(); start++) {
            for (int length = 1; length <= maxLength && start + length <= S.length(); length++) {
                subStringset.add(S.substring(start, start + length));
            }

        }
        List<Boolean> results = new ArrayList<>();
        for (String query : Q) {

            results.add(subStringset.contains(query));
        }
        return results;
    }
    }

