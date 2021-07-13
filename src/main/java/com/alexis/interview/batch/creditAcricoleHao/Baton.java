package com.alexis.interview.batch.creditAcricoleHao;

// GIVEN 2 WOOD STICK A en B
// WHAT WOULD BE THE MAX LENTH OF A SQUARE IF YOU CAN MAKE UP

import java.util.*;
import java.util.stream.Collectors;

public class Baton {

    public int solutionBIS(int A, int B){
        int big = B, small = A;
        if(A == B) return (int) A/2;
        if(A > B){
            big=A;
            small=B;
        }
        if(big/4>small){
            return (int) big/4;
        }
        if(big/3>small && big/4>small){
            return (int) big/4;
        }
        if(big/3>small && big/4<small){
            return (int) small;
        }
        if(big/2<small){
            return (int) small/2;
        }
        if(big/2>=small){
            return (int) big/3;
        }
        return 0;
    }


    public int solution(int a, int b) {
        int min = Math.min(a,b);
        int max = Math.max(a,b);

        int total = max + min;

        if (((a % 2)== 0 && (b % 2)== 0) && (total % 4)==0) {
            return total / 4;
        }

        Set<Integer> resultats = new HashSet<>();
        for (int i = 1; i <= 4; i++) {
            resultats.add(min / i);
            resultats.add(max / i);
        }
        Integer res = resultats.stream().filter(x->x * 4 < total).max(Comparator.naturalOrder()).orElse(0);
        return res;
    }

    public int solution(String S, int[] C) {
        int res=0;
        List<Integer> resList = new ArrayList<>();
        // thrower une exception si les tailles sont différentes
        // TO DO
        if (S != null && !S.isEmpty()) {
            int i = 0;
            while (i < S.length() - 1) {
                if (S.charAt(i) == S.charAt(i+1)) {
                    resList.add(Math.min(C[i],C[i+1]));
                }
                i++;
            }
            res= resList.stream().collect(Collectors.summingInt(Integer::intValue));
        }
        return res;
    }
}
