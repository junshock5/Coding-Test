package com.company.programmers;

import java.text.ParseException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


class four {
    public static String solution(String[] votes, int k) {
        String answer = "";

        int sum = 0;

        HashMap<String, Double> duplicate_count = new HashMap<String, Double>();
        ValueComparator bvc = new ValueComparator(duplicate_count);
        ValueComparator2 bvc2 = new ValueComparator2(duplicate_count);
        TreeMap<String, Double> sorted_map = new TreeMap<String, Double>(bvc);
        TreeMap<String, Double> sorted_map2 = new TreeMap<String, Double>(bvc2);

        for (int i = 0; i < votes.length; i++) { // ArrayList 만큼 반복
            if (duplicate_count.containsKey(votes[i])) { // HashMap 내부에 이미 key 값이 존재하는지 확인
                duplicate_count.put(votes[i], duplicate_count.get(votes[i]) + 1);  // key가 이미 있다면 value에 +1
            } else { // key값이 존재하지 않으면
                duplicate_count.put(votes[i], (double) 1); // key 값을 생성후 value를 1로 초기화
            }
        }
        //System.out.println("unsorted map: " + duplicate_count);
        sorted_map.putAll(duplicate_count);
        sorted_map2.putAll(duplicate_count);
        System.out.println("results: " + sorted_map);


        for (Map.Entry<String, Double> entry : sorted_map.entrySet()) {
            if (k > 0)
                sum += entry.getValue();
            k = k - 1;
        }

        for (Map.Entry<String, Double> entry : sorted_map2.entrySet()) {
            if (sum - entry.getValue() >= 0)
                sum -= entry.getValue();
            else {
                answer = entry.getKey();
                break;
            }

        }
        System.out.println(sum);
        return answer;
    }

    static class ValueComparator implements Comparator<String> {
        Map<String, Double> base;

        public ValueComparator(Map<String, Double> base) {
            this.base = base;
        }

        // Note: this comparator imposes orderings that are inconsistent with
        // equals.
        public int compare(String a, String b) {
            if (base.get(a) >= base.get(b)) {
                return -1;
            } else {
                return 1;
            } // returning 0 would merge keys
        }
    }

    static class ValueComparator2 implements Comparator<String> {
        Map<String, Double> base;

        public ValueComparator2(Map<String, Double> base) {
            this.base = base;
        }

        // Note: this comparator imposes orderings that are inconsistent with
        // equals.
        public int compare(String a, String b) {
            if (base.get(a) <= base.get(b)) {
                return -1;
            } else {
                return 1;
            } // returning 0 would merge keys
        }
    }

    public static void main(String[] args) throws ParseException {

        String[] temp = {"AAD", "AAA", "AAC", "AAB"};

        solution(temp, 4);
    }

}